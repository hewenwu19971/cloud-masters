package com.hww.uc.controller;

import com.hww.common.Vo.MailVo;
import com.hww.common.Vo.RegisterVo;
import com.hww.common.base.Result;
import com.hww.uc.security.TokenManager;
import com.hww.uc.service.impl.MailServiceImpl;
import com.hww.uc.service.impl.TSysUserImpl;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;

@Slf4j
@RestController
@RequestMapping("/api/auth")
public class UserController {

    @Autowired
    private MailServiceImpl mailService;
    @Autowired
    private TSysUserImpl tSysUserService;

    @Autowired
    private StringRedisTemplate redisTemplate;
    @Autowired
    private TokenManager tokenManager;

    @RequestMapping("/mailcaptcha")
    public Result mailCaptcha(@RequestBody MailVo mailVo) {
        mailService.sendMail(mailVo.getMail());
        return new Result(true, 1, "成功");
    }

    @RequestMapping("/register")
    public Result register(@RequestBody RegisterVo registerVo) {
        log.info("注册{}",registerVo);
        String s = redisTemplate.opsForValue().get(registerVo.getMobile() + "_mail");
        if (s != null){
            if (s.equals(registerVo.getMobilecheck())){
                return new Result(true, tSysUserService.addUser(registerVo), "成功");
            }
        }
        return new Result(true, 2, "验证码错误");
    }

    @RequestMapping("/profile")
    public Result profile(HttpServletRequest request){
        String token = request.getHeader("token");
         String user =  tokenManager.getUserFromToken(token);

         log.info("个人信息{}",user);
        return new Result(true,1,"成功", tSysUserService.getUserAll(user));
    }
}
