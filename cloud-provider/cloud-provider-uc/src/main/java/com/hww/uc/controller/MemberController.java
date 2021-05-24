package com.hww.uc.controller;

import com.hww.common.base.Result;
import com.hww.common.entity.BsAddresses;
import com.hww.common.entity.TSysUser;
import com.hww.uc.security.TokenManager;
import com.hww.uc.service.impl.BsAddressServiceImpl;
import com.hww.uc.service.impl.TSysUserImpl;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;

@RequestMapping("/api/member")
@Slf4j
@RestController
public class MemberController {

    @Autowired
    private TSysUserImpl tSysUserService;
    @Autowired
    private BsAddressServiceImpl bsAddressService;

    @RequestMapping("/update_profile")
    public Result updateMemberInfor(@RequestBody TSysUser tSysUser, HttpServletRequest request) {
        String token = request.getHeader("token");
        TokenManager tokenManager = new TokenManager();
        String userName = tokenManager.getUserFromToken(token);
        tSysUser.setUsername(userName);
        log.info("{}修改信息{}", userName, tSysUser);
        return new Result(true, tSysUserService.upDataUser(tSysUser), "成功");
    }

    @RequestMapping("/address/index")
    public Result getAddress(HttpServletRequest request) {
        String token = request.getHeader("token");
        TokenManager tokenManager = new TokenManager();
        String userName = tokenManager.getUserFromToken(token);
        TSysUser user = tSysUserService.getUserId(userName);
        return new Result(true, 1, "成功", bsAddressService.getUserAddress(user.getId()));
    }

    @RequestMapping("/address/save")
    public Result updateAddress(@RequestBody BsAddresses bsAddresses, HttpServletRequest request) {
        String token = request.getHeader("token");
        TokenManager tokenManager = new TokenManager();
        String userName = tokenManager.getUserFromToken(token);
        TSysUser user = tSysUserService.getUserId(userName);
        bsAddresses.setMId(user.getId());
        log.info("用户{}",bsAddresses);
        if (bsAddresses.getId() == 0) {
            return new Result(true, bsAddressService.addAddress(bsAddresses), "添加成功");
        }
        return new Result(true, bsAddressService.updataAddress(bsAddresses), "保存成功");
    }


    @RequestMapping("/address/view")
    public Result getAddressView(@RequestBody BsAddresses bsAddresses, HttpServletRequest request) {

        return new Result(true, 1, "成功", bsAddressService.getAddress(bsAddresses.getId()));
    }

    @RequestMapping("/address/delete")
    public Result delAddressView(@RequestBody BsAddresses bsAddresses, HttpServletRequest request) {

        return new Result(true, bsAddressService.deleteAddress(bsAddresses.getId()), "成功");
    }
}
