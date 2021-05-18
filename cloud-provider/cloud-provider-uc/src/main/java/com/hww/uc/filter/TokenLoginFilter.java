package com.hww.uc.filter;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.hww.common.base.Result;
import com.hww.common.entity.TSysUser;
import com.hww.common.utils.ResponseUtil;
import com.hww.uc.dto.SecurityUser;
import com.hww.uc.security.TokenManager;
import lombok.extern.slf4j.Slf4j;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.AuthenticationException;
import org.springframework.security.web.authentication.UsernamePasswordAuthenticationFilter;
import org.springframework.security.web.util.matcher.AntPathRequestMatcher;

import javax.servlet.FilterChain;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.ArrayList;

/**
 * 登录过滤器，继承UsernamePasswordAuthenticationFilter，对用户名密码进行登录校验
 */
@Slf4j
public class TokenLoginFilter extends UsernamePasswordAuthenticationFilter {
    //认证管理器
    private AuthenticationManager authenticationManager;
    private TokenManager tokenManager;
    /**
     * 设置要拦截的url
     */
    public TokenLoginFilter(AuthenticationManager authenticationManager,TokenManager tokenManager){
        this.authenticationManager = authenticationManager;
        this.tokenManager = tokenManager;
        this.setPostOnly(false);
        this.setRequiresAuthenticationRequestMatcher(new AntPathRequestMatcher("/api/auth/login","POST"));
    }


    @Override
    public Authentication attemptAuthentication(HttpServletRequest request, HttpServletResponse response) throws AuthenticationException {

            try {
                TSysUser user = new ObjectMapper().readValue(request.getInputStream(), TSysUser.class);

                return authenticationManager.authenticate(new UsernamePasswordAuthenticationToken(user.getUsername(), user.getPassword(), new ArrayList<>()));
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
    }

    /**
     * 登录失败
     * @param request
     * @param response
     * @param failed
     * @throws IOException
     * @throws ServletException
     */
    @Override
    protected void unsuccessfulAuthentication(HttpServletRequest request, HttpServletResponse response, AuthenticationException failed) throws IOException, ServletException {

            ResponseUtil.out(response, new Result(false,1,"失败"));

    }

    /**
     * 登陆成功
     * @param request
     * @param response
     * @param chain
     * @param authResult
     * @throws IOException
     * @throws ServletException
     */
    @Override
    protected void successfulAuthentication(HttpServletRequest request, HttpServletResponse response, FilterChain chain, Authentication authResult) throws IOException, ServletException {
        SecurityUser user = (SecurityUser) authResult.getPrincipal();
        String token = tokenManager.createToken(user.getCurrentUserInfo().getUsername());
        log.info("token:{}",token);
       // redisTemplate.opsForValue().set(user.getCurrentUserInfo().getUsername(), user.getPermissionValueList());

            ResponseUtil.out(response, new Result(true,1,"成功",token));

    }
}
