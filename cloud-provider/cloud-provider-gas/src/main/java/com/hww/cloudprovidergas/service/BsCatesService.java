package com.hww.cloudprovidergas.service;

import com.hww.common.entity.BsCates;
import com.hww.common.entity.BsGoods;

import java.util.List;

public interface BsCatesService {

    List<BsCates> findByIdCates(BsCates bsCates);

    List<BsGoods> findByCateIdGoods(BsCates bsCates);
}
