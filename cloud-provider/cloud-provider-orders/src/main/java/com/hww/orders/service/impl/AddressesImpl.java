package com.hww.orders.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.toolkit.Wrappers;
import com.hww.common.entity.BsAddresses;
import com.hww.common.entity.BsCates;
import com.hww.orders.mapper.AddressesMapper;
import com.hww.orders.service.AddressesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AddressesImpl implements AddressesService {
    @Autowired
    private AddressesMapper addressesMapper;

    @Override
    public BsAddresses getByAddressesId(Long userId) {
        QueryWrapper<BsAddresses> query = Wrappers.query();
        query.eq("m_id", userId);
        query.eq("is_default", 2);
        return addressesMapper.selectOne(query);

    }

    @Override
    public BsAddresses findAddressById(String Id) {
        return addressesMapper.selectById(Id);
    }
}
