package com.hww.cloudprovidergas.service.impl;

import com.hww.cloudprovidergas.mapper.MerchandiseSearchMapper;
import com.hww.cloudprovidergas.service.MerchandiseSearchService;
import com.hww.common.entity.BsAds;
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
}
