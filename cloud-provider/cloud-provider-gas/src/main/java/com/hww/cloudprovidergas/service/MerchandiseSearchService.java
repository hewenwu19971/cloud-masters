package com.hww.cloudprovidergas.service;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.hww.common.Vo.BsGoodsVo;
import com.hww.common.entity.BsAds;
import com.hww.common.entity.BsCates;
import com.hww.common.entity.BsGoods;

import java.util.List;

public interface MerchandiseSearchService {

    public List<BsAds> searchBanner();
    List<BsCates> searchCates();
    List<BsGoods> searchGoods();
    BsGoodsVo searchAllGoods(int currentPage);
}
