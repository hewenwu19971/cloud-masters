package com.hww.cloudprovidergas.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.toolkit.Wrappers;
import com.hww.cloudprovidergas.mapper.BsSpecAttrMapper;
import com.hww.cloudprovidergas.mapper.BsSpecsMapper;
import com.hww.cloudprovidergas.service.BsSpecsService;
import com.hww.common.entity.BsGoods;
import com.hww.common.entity.BsSpecAttrs;
import com.hww.common.entity.BsSpecs;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Arrays;
import java.util.List;

@Service
public class BsSpecsImpl implements BsSpecsService {
    @Autowired
    private BsSpecsMapper bsSpecsMapper;

    @Autowired
    private BsSpecAttrMapper bsSpecAttrMapper;

    @Override
    public List<BsSpecs> findSpecs(List<String> id) {
        return bsSpecsMapper.queryBsSpecs(id);
    }

    @Override
    public List<BsSpecAttrs> getSpecAttrs(String id) {

        String[] split = id.split(",");
        QueryWrapper<BsSpecAttrs> query = Wrappers.query();
        query.in("id", split);
        return bsSpecAttrMapper.selectList(query);
    }
}
