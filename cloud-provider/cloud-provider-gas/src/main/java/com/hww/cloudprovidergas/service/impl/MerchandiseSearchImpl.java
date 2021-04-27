package com.hww.cloudprovidergas.service.impl;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.hww.cloudprovidergas.mapper.MerchandiseSearchMapper;
import com.hww.cloudprovidergas.service.MerchandiseSearchService;
import com.hww.common.Vo.BsGoodsVo;
import com.hww.common.entity.BsAds;
import com.hww.common.entity.BsCates;
import com.hww.common.entity.BsGoods;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MerchandiseSearchImpl implements MerchandiseSearchService {
    @Autowired
    private MerchandiseSearchMapper merchandiseSearchMapper;

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
    public BsGoodsVo searchAllGoods(int currentpage) {
        BsGoodsVo bsGoods = new BsGoodsVo();
        IPage<BsGoods> userPage = new Page<>(currentpage, 6);//参数一是当前页，参数二是每页个数
        userPage = merchandiseSearchMapper.selectPage(userPage, null);
        bsGoods.setCurrent(currentpage);
        bsGoods.setSize(10);
        bsGoods.setTotal(userPage.getTotal());
        bsGoods.setGoodsList(userPage.getRecords());
        bsGoods.setPages(userPage.getPages());
        return bsGoods;

    }

}
