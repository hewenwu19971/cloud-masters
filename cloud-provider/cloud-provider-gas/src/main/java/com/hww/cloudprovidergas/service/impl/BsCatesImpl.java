package com.hww.cloudprovidergas.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.toolkit.Wrappers;
import com.hww.cloudprovidergas.mapper.BsCatesMapper;
import com.hww.cloudprovidergas.mapper.MerchandiseSearchMapper;
import com.hww.cloudprovidergas.service.BsCatesService;
import com.hww.common.entity.BsCates;
import com.hww.common.entity.BsGoods;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.sql.Wrapper;
import java.util.List;

@Service
public class BsCatesImpl implements BsCatesService {
    @Autowired
    private BsCatesMapper bsCatesMapper;

    @Autowired
    private MerchandiseSearchMapper merchandiseSearchMapper;

    @Override
    public List<BsCates> findByIdCates(BsCates bsCates) {
        QueryWrapper<BsCates> query = Wrappers.query();
        if (bsCates.getTopId() != 0){
            query.eq("top_id",bsCates.getTopId());
        }

        return bsCatesMapper.selectList(query);
    }

    @Override
    public List<BsGoods> findByCateIdGoods(BsCates bsCates) {
        QueryWrapper<BsGoods> query = Wrappers.query();
        query.eq("cate_id",bsCates.getId());
        return merchandiseSearchMapper.selectList(query);
    }


}
