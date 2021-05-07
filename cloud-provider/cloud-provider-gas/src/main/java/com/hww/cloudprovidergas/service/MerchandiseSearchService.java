package com.hww.cloudprovidergas.service;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.hww.common.Vo.BsGoodsVo;
import com.hww.common.entity.*;

import java.util.List;

public interface MerchandiseSearchService {

    public List<BsAds> searchBanner();
    List<BsCates> searchCates();
    List<BsGoods> searchGoods();
    BsGoodsVo searchAllGoods(BsGoodsVo bsGoodsVo);
    BsGoods findByIdGoods(BsGoods bsGoods);

    List<BsSpecs> findBySpecIdSpec(String specId);
    List<BsSpecAttrs> findBySpecIdSpecAttr(List<BsSpecs> bsSpecs);
}
