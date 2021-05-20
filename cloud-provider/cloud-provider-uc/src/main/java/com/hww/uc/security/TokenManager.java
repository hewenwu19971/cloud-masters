package com.hww.uc.security;

import io.jsonwebtoken.Claims;
import io.jsonwebtoken.CompressionCodecs;
import io.jsonwebtoken.Jwts;
import io.jsonwebtoken.SignatureAlgorithm;
import org.springframework.stereotype.Component;

import java.util.Date;

@Component
public class TokenManager {

    private long tokenExpiration = 24 * 60 * 60 * 1000;//一天
    private long refreshTokenExpiration = 30 * 24 * 60 * 60 * 1000;//一月
    private String tokenSignKey = "123456";

    /**
     * 普通令牌
     *
     * @param username
     * @return
     */
    public String createToken(String username) {
        String token = Jwts.builder().setSubject(username)
                .setExpiration(new Date(System.currentTimeMillis() + tokenExpiration))
                .signWith(SignatureAlgorithm.HS512, tokenSignKey).compressWith(CompressionCodecs.GZIP).compact();
        return token;
    }

    /**
     * 刷新令牌
     *
     * @param username
     * @return
     */
    public String createRefreshToken(String username) {
        String token = Jwts.builder().setSubject(username)
                .setExpiration(new Date(System.currentTimeMillis() + refreshTokenExpiration))
                .signWith(SignatureAlgorithm.HS512, tokenSignKey).compressWith(CompressionCodecs.GZIP).compact();
        return token;
    }

    /**
     * 过期时间
     *
     * @return
     */
    public long getTokenExpiration() {
        return tokenExpiration;
    }

    /**
     * 解析普通令牌
     * @param token
     * @return
     */
    public String getUserFromToken(String token) {
        String user = Jwts.parser().setSigningKey(tokenSignKey).parseClaimsJws(token).getBody().getSubject();
        return user;
    }

    public Claims getTokenBody(String token){
        return Jwts.parser().setSigningKey(tokenSignKey).parseClaimsJws(token).getBody();
    }

    public Boolean isExpires(String token) {
        Claims body = this.getTokenBody(token);
        if(new Date().getTime() > body.getExpiration().getTime()){
            return true;//过期
        }
        return false;
    }

    public void removeToken(String token) {
        //jwttoken无需删除，客户端扔掉即可。
    }

    public static void main(String[] args) {
        String token = "eyJhbGciOiJIUzUxMiIsInppcCI6IkdaSVAifQ.H4sIAAAAAAAAAKtWKi5NUrJSKixU0lFKrShQsjI0MzI0NTc1MTKtBQDqQx8aHQAAAA.XuKJXI9iu2hh7I0fZ6jcBUeeWCLfZB7eG8NDibAbQGX2vunPZ998fGTPlyXUCJQHqp6YYWsCVXImIAxjf6oLhg";
        TokenManager tokenManager = new TokenManager();
        tokenManager.isExpires(token);
    }
}