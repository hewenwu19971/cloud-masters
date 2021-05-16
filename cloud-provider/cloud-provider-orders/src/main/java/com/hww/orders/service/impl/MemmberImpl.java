package com.hww.orders.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.toolkit.Wrappers;
import com.hww.common.Vo.PayVo;
import com.hww.common.entity.BsMembers;
import com.hww.orders.mapper.BsMembersMapper;
import com.hww.orders.service.MemmberService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class MemmberImpl implements MemmberService {
    @Autowired
    private BsMembersMapper bsMembersMapper;

    @Override
    public BsMembers findPayPwdByUserId(int id) {
        QueryWrapper<BsMembers> query = Wrappers.query();
        query.eq("user_id",id);
        return bsMembersMapper.selectOne(query);
    }

    @Override
    public Integer payment(PayVo payVo, BsMembers balance, int userId) {
        QueryWrapper<BsMembers> query = Wrappers.query();
        query.eq("user_id",userId).eq("balance",balance.getBalance());

        balance.setBalance(balance.getBalance()-payVo.getMoney());
        return bsMembersMapper.update(balance, query);
    }
}
