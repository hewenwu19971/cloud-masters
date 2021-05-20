package com.hww.uc.security;

import com.hww.common.base.Result;
import com.hww.common.utils.ResponseUtil;
import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.security.core.Authentication;
import org.springframework.security.web.authentication.logout.LogoutHandler;
import org.springframework.stereotype.Component;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * 登出业务逻辑类
 */
@Component
public class TokenLogoutHandler implements LogoutHandler {
    private TokenManager tokenManager;
    private StringRedisTemplate redisTemplate;

    public TokenLogoutHandler(TokenManager tokenManager,StringRedisTemplate redisTemplate) {
        this.tokenManager = tokenManager;
        this.redisTemplate = redisTemplate;
    }

    @Override
    public void logout(HttpServletRequest request, HttpServletResponse response, Authentication authentication) {
        String token = request.getHeader("token");
        if (token != null) {
            tokenManager.removeToken(token);
            //清空当前用户缓存中的权限数据
            String userName = tokenManager.getUserFromToken(token);
            redisTemplate.delete(userName);
        }
            ResponseUtil.out(response, new Result(true,1,"成功"));
    }
}
