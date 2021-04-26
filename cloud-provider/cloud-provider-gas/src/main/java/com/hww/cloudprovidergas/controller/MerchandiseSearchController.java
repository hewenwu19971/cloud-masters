package com.hww.cloudprovidergas.controller;

import com.hww.cloudprovidergas.service.impl.MerchandiseSearchImpl;
import com.hww.common.base.Result;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

@RestController
@RequestMapping("/api")
public class MerchandiseSearchController {

    @Autowired
    private MerchandiseSearchImpl merchandiseSearch;

    @PostMapping("/common/batch")
    public Result batch() {
        Map<String, Object> map = new HashMap<>();
        map.put("advs",merchandiseSearch.searchBanner());
        map.put("fourads",merchandiseSearch.searchBanner());
        return new Result(true, 1, "查询成功", map);
    }
}
