package com.hww.orders.service.impl;

import com.hww.common.entity.BsSpecAttrs;
import com.hww.orders.mapper.BsSpecAttrsMapper;
import com.hww.orders.service.BsSpecAttrsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class BsSpecAttrsServiceImpl implements BsSpecAttrsService {
@Autowired
private BsSpecAttrsMapper bsSpecAttrsMapper;
    @Override
    public BsSpecAttrs getSpecPrice(String id) {
        return bsSpecAttrsMapper.selectById(id);
    }
}
