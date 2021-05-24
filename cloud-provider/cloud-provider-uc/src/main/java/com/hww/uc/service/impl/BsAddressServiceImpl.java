package com.hww.uc.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.toolkit.Wrappers;
import com.hww.common.entity.BsAddresses;
import com.hww.uc.mapper.BsAddressMapper;
import com.hww.uc.service.BsAddressService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BsAddressServiceImpl implements BsAddressService {
    @Autowired
    private BsAddressMapper bsAddressMapper;

    @Override
    public List<BsAddresses> getUserAddress(Long id) {
        QueryWrapper<BsAddresses> query = Wrappers.query();
        query.eq("m_id",id);
        return bsAddressMapper.selectList(query);
    }

    @Override
    public Integer addAddress(BsAddresses bsAddresses) {
        return bsAddressMapper.insert(bsAddresses);
    }

    @Override
    public BsAddresses getAddress(Long id) {
        return bsAddressMapper.selectById(id);
    }

    @Override
    public Integer deleteAddress(Long id) {
        return bsAddressMapper.deleteById(id);
    }

    @Override
    public Integer updataAddress(BsAddresses bsAddresses) {
        QueryWrapper<BsAddresses> query = Wrappers.query();
        query.eq("id",bsAddresses.getId());
        return bsAddressMapper.update(bsAddresses,query);
    }
}
