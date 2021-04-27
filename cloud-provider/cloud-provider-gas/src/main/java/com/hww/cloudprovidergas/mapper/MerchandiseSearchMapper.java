package com.hww.cloudprovidergas.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.hww.common.entity.BsAds;
import com.hww.common.entity.BsCates;
import com.hww.common.entity.BsGoods;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface MerchandiseSearchMapper extends BaseMapper<BsGoods> {
    /**
     * 查询banner
     * @return
     */
    public List<BsAds> searchbanner();

    /**
     *
     * @return
     */
    List<BsCates> searchCates();

    List<BsGoods> searchGoods();

    List<BsGoods> searchAllGoods();
}
