package com.hww.common.utils;

import io.jsonwebtoken.Claims;
import io.jsonwebtoken.CompressionCodecs;
import io.jsonwebtoken.Jwts;
import io.jsonwebtoken.SignatureAlgorithm;

import java.util.Date;

public class TokenUtil {
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
}
