package com.hww.uc.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.toolkit.Wrappers;
import com.hww.common.Vo.RegisterVo;
import com.hww.common.entity.TSysUser;
import com.hww.common.utils.MD5Utils;
import com.hww.uc.mapper.TSysUserMapper;
import com.hww.uc.service.TSysUserService;
import org.apache.commons.lang.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TSysUserImpl implements TSysUserService {
    @Autowired
    private TSysUserMapper tSysUserMapper;


    @Override
    public Integer addUser(RegisterVo registerVo) {
        if (StringUtils.isNotBlank(registerVo.getPassword()) && StringUtils.isNotBlank(registerVo.getRepassword())) {
            if (registerVo.getPassword().equals(registerVo.getRepassword())) {
                TSysUser tSysUser = new TSysUser();
                tSysUser.setUsername(registerVo.getMobile());
                tSysUser.setPassword(MD5Utils.string2MD5(registerVo.getPassword()));
                tSysUser.setNickName(registerVo.getUsername());
                return tSysUserMapper.insert(tSysUser);
            }
        }
        return 2;
    }

    @Override
    public TSysUser getUserAll(String user) {
        QueryWrapper<TSysUser> query = Wrappers.query();
        query.eq("username", user);
        return tSysUserMapper.selectOne(query);
    }

    @Override
    public Integer upDataUser(TSysUser tSysUser) {
        QueryWrapper<TSysUser> query = Wrappers.query();
        query.eq("username", tSysUser.getUsername());
        return tSysUserMapper.update(tSysUser, query);
    }

    @Override
    public TSysUser getUserId(String username) {
        QueryWrapper<TSysUser> query = Wrappers.query();
        query.eq("username", username);
        return tSysUserMapper.selectOne(query);
    }
}
