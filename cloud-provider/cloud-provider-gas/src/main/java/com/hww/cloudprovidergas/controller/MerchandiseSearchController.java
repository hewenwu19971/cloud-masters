package com.hww.cloudprovidergas.controller;

import com.hww.cloudprovidergas.service.impl.BsCatesImpl;
import com.hww.cloudprovidergas.service.impl.MerchandiseSearchImpl;
import com.hww.common.Vo.BsGoodsVo;
import com.hww.common.base.Result;
import com.hww.common.entity.BsCates;
import com.hww.common.entity.BsGoods;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.Map;

@RestController
@RequestMapping("/api")
@Slf4j
public class MerchandiseSearchController {

    @Autowired
    private MerchandiseSearchImpl merchandiseSearch;


    @Autowired
    private BsCatesImpl bsCatesService;

    @PostMapping("/common/batch")
    public Result batch(@RequestBody BsGoodsVo page) {
        Map<String, Object> map = new HashMap<>();
        map.put("advs", merchandiseSearch.searchBanner());
        map.put("fourads", merchandiseSearch.searchBanner());
        map.put("cates", merchandiseSearch.searchCates());
        map.put("goods", merchandiseSearch.searchGoods());
        log.info("这是/common/batch：{}", page.getCatesid());
        map.put("product", merchandiseSearch.searchAllGoods(page));
        return new Result(true, 1, "查询成功", map);
    }

    @RequestMapping("/goods/hotListPage")
    public Result hotListPage(@RequestBody BsGoodsVo page) {
        Map<Object, Object> map = new HashMap<>();
        map.put("product", merchandiseSearch.searchAllGoods(page));
        return new Result(true, 1, "查询成功", map);
    }

    @RequestMapping("/product/get_cates")
    public Result getParentCate(@RequestBody BsCates bsCates) {
        return new Result(true, 1, "查询成功", bsCatesService.findByIdCates(bsCates));
    }

    @RequestMapping("/product/get_list")
    public Result getCates(@RequestBody  BsGoodsVo page) {
        return new Result(true, 1, "查询成功", merchandiseSearch.searchAllGoods(page));
    }
}
