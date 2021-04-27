package com.hww.cloudprovidergas.controller;

import com.hww.cloudprovidergas.service.impl.MerchandiseSearchImpl;
import com.hww.common.Vo.BsGoodsVo;
import com.hww.common.base.Result;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.Map;

@RestController
@RequestMapping("/api")
public class MerchandiseSearchController {

    @Autowired
    private MerchandiseSearchImpl merchandiseSearch;

    @PostMapping("/common/batch")
    public Result batch(@RequestBody BsGoodsVo page) {
        Map<String, Object> map = new HashMap<>();
        map.put("advs", merchandiseSearch.searchBanner());
        map.put("fourads", merchandiseSearch.searchBanner());
        map.put("cates", merchandiseSearch.searchCates());
        map.put("goods", merchandiseSearch.searchGoods());
        map.put("product", merchandiseSearch.searchAllGoods(page.getCurrent()));
        return new Result(true, 1, "查询成功", map);
    }

    @RequestMapping("/goods/hotListPage")
    public Result hotListPage(@RequestBody BsGoodsVo page) {
        Map<Object, Object> map = new HashMap<>();
        map.put("product", merchandiseSearch.searchAllGoods(page.getCurrent()));
        return new Result(true, 1, "查询成功", map);
    }
}
