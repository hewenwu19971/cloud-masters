package com.hww.cloudprovidergas.service.impl;

import com.hww.cloudprovidergas.mapper.BsSpecsMapper;
import com.hww.cloudprovidergas.service.BsSpecsService;
import com.hww.common.entity.BsSpecs;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class BsSpecsImpl implements BsSpecsService {
    @Autowired
    private BsSpecsMapper bsSpecsMapper;
    @Override
    public List<BsSpecs> findSpecs(List<String> id) {
        return bsSpecsMapper.queryBsSpecs(id);
    }
}
