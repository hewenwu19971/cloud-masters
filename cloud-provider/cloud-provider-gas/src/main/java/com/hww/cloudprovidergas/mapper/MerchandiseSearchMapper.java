package com.hww.cloudprovidergas.mapper;

import com.hww.common.entity.BsAds;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface MerchandiseSearchMapper {
    /**
     * 查询banner
     * @return
     */
    public List<BsAds> searchbanner();
}
