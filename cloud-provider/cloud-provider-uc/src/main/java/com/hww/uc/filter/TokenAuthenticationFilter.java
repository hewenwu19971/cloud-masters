package com.hww.uc.filter;

import com.hww.common.base.Result;
import com.hww.common.utils.ResponseUtil;
import com.hww.uc.security.TokenManager;
import org.apache.commons.lang.StringUtils;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.web.authentication.www.BasicAuthenticationFilter;
import javax.servlet.FilterChain;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;


/**
 * 访问过滤器
 */
public class TokenAuthenticationFilter extends BasicAuthenticationFilter {

   private TokenManager tokenManager;

    /**
     * 令牌认证过滤器
     * @param authenticationManager
     */
    public TokenAuthenticationFilter(AuthenticationManager authenticationManager,TokenManager tokenManager) {
        super(authenticationManager);
        this.tokenManager = tokenManager;
    }


    @Override
    protected void doFilterInternal(HttpServletRequest req, HttpServletResponse res, FilterChain chain) throws IOException, ServletException {
        logger.info("================="+req.getRequestURI());
        if(req.getRequestURI().contains("login")) {
            chain.doFilter(req, res);
            return;
        }

        UsernamePasswordAuthenticationToken authentication = null;
        try {
            authentication = getAuthentication(req);
        } catch (Exception e) {

                ResponseUtil.out(res, new Result(false,1,"错误",e));

        }

        if (authentication != null) {
            SecurityContextHolder.getContext().setAuthentication(authentication);
        } else {
                ResponseUtil.out(res, new Result(false,1,"错误"));
        }
        chain.doFilter(req, res);

    }

    /**
     * 获取身份验证
     * @param request
     * @return
     */
    private UsernamePasswordAuthenticationToken getAuthentication(HttpServletRequest request) {
        // token置于header里
        String token = request.getHeader("token");
        if (token != null && !"".equals(token.trim())) {
            String userName = tokenManager.getUserFromToken(token);
//
//            List<String> permissionValueList = (List<String>) redisTemplate.opsForValue().get(userName);
//            Collection<GrantedAuthority> authorities = new ArrayList<>();
//            for(String permissionValue : permissionValueList) {
//                if(StringUtils.isEmpty(permissionValue)) continue;
//                SimpleGrantedAuthority authority = new SimpleGrantedAuthority(permissionValue);
//                authorities.add(authority);
//            }
//
            if (!StringUtils.isEmpty(userName)) {
                return new UsernamePasswordAuthenticationToken(userName, token, null);
            }
            return null;
        }
        return null;
    }


}
