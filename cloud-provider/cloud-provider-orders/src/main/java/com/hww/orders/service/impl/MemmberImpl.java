package com.hww.orders.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.toolkit.Wrappers;
import com.hww.common.Vo.PayVo;
import com.hww.common.entity.BsMembers;
import com.hww.common.entity.TSysUser;
import com.hww.orders.mapper.BsMembersMapper;
import com.hww.orders.mapper.TsysUserMapper;
import com.hww.orders.service.MemmberService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class MemmberImpl implements MemmberService {
    @Autowired
    private BsMembersMapper bsMembersMapper;
    @Autowired
    private TsysUserMapper tsysUserMapper;

    @Override
    public BsMembers findPayPwdByUserId(Long id) {
        QueryWrapper<BsMembers> query = Wrappers.query();
        query.eq("user_id", id);
        return bsMembersMapper.selectOne(query);
    }

    @Override
    public Integer payment(PayVo payVo, TSysUser tSysUser, Long userId) {
        QueryWrapper<TSysUser> query = Wrappers.query();
        query.eq("id", userId).eq("balance", tSysUser.getBalance());

        tSysUser.setBalance(tSysUser.getBalance() - payVo.getMoney());
        return tsysUserMapper.update(tSysUser, query);
    }
}
