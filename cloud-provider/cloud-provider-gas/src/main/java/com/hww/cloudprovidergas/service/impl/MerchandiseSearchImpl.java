package com.hww.cloudprovidergas.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.core.toolkit.Wrappers;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.hww.cloudprovidergas.mapper.BsCatesMapper;
import com.hww.cloudprovidergas.mapper.BsSpecAttrMapper;
import com.hww.cloudprovidergas.mapper.BsSpecsMapper;
import com.hww.cloudprovidergas.mapper.MerchandiseSearchMapper;
import com.hww.cloudprovidergas.service.MerchandiseSearchService;
import com.hww.common.Vo.BsGoodsVo;
import com.hww.common.Vo.PrepareVo;
import com.hww.common.entity.*;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Slf4j
@Service
public class MerchandiseSearchImpl implements MerchandiseSearchService {
    @Autowired
    private MerchandiseSearchMapper merchandiseSearchMapper;

    @Autowired
    private BsSpecsMapper bsSpecsMapper;

    @Autowired
    private BsSpecAttrMapper bsSpecAttrMapper;
    @Override
    public List<BsAds> searchBanner() {
        return merchandiseSearchMapper.searchbanner();
    }

    @Override
    public List<BsCates> searchCates() {
        return merchandiseSearchMapper.searchCates();
    }

    @Override
    public List<BsGoods> searchGoods() {
        return merchandiseSearchMapper.searchGoods();
    }

    @Override
    public BsGoodsVo searchAllGoods(BsGoodsVo bsGoodsVo) {
        QueryWrapper<BsGoods> query = Wrappers.query();
        if (bsGoodsVo.getCatesid() != 0) {
            query.eq("cate_id", bsGoodsVo.getCatesid());
        }
        if (bsGoodsVo.getCurrent() != null) {
            IPage<BsGoods> userPage = new Page<>(bsGoodsVo.getCurrent(), 6);//参数一是当前页，参数二是每页个数
            userPage = merchandiseSearchMapper.selectPage(userPage, query);
            bsGoodsVo.setCurrent(bsGoodsVo.getCurrent());
            bsGoodsVo.setSize(10);
            bsGoodsVo.setTotal(userPage.getTotal());
            bsGoodsVo.setGoodsList(userPage.getRecords());
            bsGoodsVo.setPages(userPage.getPages());
        }
        return bsGoodsVo;

    }

    @Override
    public BsGoods findByIdGoods(BsGoods bsGoods) {
        return merchandiseSearchMapper.selectById(bsGoods.getId());
    }

    /**
     * 查询规格
     *
     * @param specId
     * @return
     */
    @Override
    public List<BsSpecs> findBySpecIdSpec(String specId) {
        String d[] = specId.split(",");
        List<String> list = new ArrayList<String>();

        for (int i = 0; i < d.length; i++) {
            list.add(d[i]);
        }

        log.info("查询的规格id {}", list);
        return bsSpecsMapper.selectBatchIds(list);
    }

    @Override
    public List<BsSpecAttrs> findBySpecIdSpecAttr(List<BsSpecs> bsSpecs) {
        QueryWrapper<BsSpecAttrs> query = Wrappers.query();
        List<Object> list = new ArrayList<>();
        for (int i = 0; i < bsSpecs.size(); i++) {
            list.add(bsSpecs.get(i).getId());
        }
        query.in("spec_id",list);
        List<BsSpecAttrs> bsSpecAttrs = bsSpecAttrMapper.selectList(query);
        return bsSpecAttrs;
    }
    @Override
    public BsGoods findByGoodsId(PrepareVo prepareVo) {
        BsGoods bsGoods = merchandiseSearchMapper.selectById(prepareVo.getCartVos().getSku_id());
        return bsGoods;
    }

}
