package com.hww.orders.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.toolkit.Wrappers;
import com.hww.common.entity.TSysUser;
import com.hww.orders.mapper.TsysUserMapper;
import com.hww.orders.service.TSysUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TSysUserServiceImpl implements TSysUserService {
    @Autowired
    private TsysUserMapper tsysUserMapper;

    @Override
    public TSysUser getUserId(String username) {
        QueryWrapper<TSysUser> query = Wrappers.query();
        query.eq("username",username);
        return tsysUserMapper.selectOne(query);
    }
}
