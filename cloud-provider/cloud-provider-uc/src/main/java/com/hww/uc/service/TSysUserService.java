package com.hww.uc.service;

import com.hww.common.Vo.RegisterVo;
import com.hww.common.entity.TSysUser;

public interface TSysUserService {

    Integer addUser(RegisterVo registerVo);

    TSysUser getUserAll(String user);
}
