package com.hww.uc.controller;

import com.hww.common.base.Result;
import com.hww.common.entity.BsAdmins;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {

    @RequestMapping("/api/auth/login")
    public Result login(@RequestBody BsAdmins admins){
        return new Result(true,1,"成功");
    }
}
