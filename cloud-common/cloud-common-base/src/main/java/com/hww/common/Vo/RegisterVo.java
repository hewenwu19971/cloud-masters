package com.hww.common.Vo;

import lombok.Data;

@Data
public class RegisterVo {
    private String username;
    private String mobile;
    private String password;
    private String repassword;
    private String mobilecheck;
}
