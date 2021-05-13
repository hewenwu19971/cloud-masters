package com.hww.cloudprovidergas.controller;

import com.hww.cloudprovidergas.service.impl.BsCatesImpl;
import com.hww.cloudprovidergas.service.impl.BsSpecsImpl;
import com.hww.cloudprovidergas.service.impl.MerchandiseSearchImpl;
import com.hww.common.Vo.BsGoodsVo;
import com.hww.common.Vo.PrepareVo;
import com.hww.common.base.Result;
import com.hww.common.entity.BsCates;
import com.hww.common.entity.BsGoods;
import com.hww.common.entity.BsSpecs;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.*;

@RestController
@RequestMapping("/api")
@Slf4j
public class MerchandiseSearchController {

    @Autowired
    private MerchandiseSearchImpl merchandiseSearch;


    @Autowired
    private BsCatesImpl bsCatesService;

    @Autowired

    private BsSpecsImpl bsSpecsService;

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
    public Result getCates(@RequestBody BsGoodsVo page) {
        return new Result(true, 1, "查询成功", merchandiseSearch.searchAllGoods(page));
    }

    @RequestMapping("/product/view")
    public Result getGoods(@RequestBody BsGoods bsGoods) {
        Map<Object, Object> map = new HashMap<>();
        BsGoods BsGoods = merchandiseSearch.findByIdGoods(bsGoods);
        if (BsGoods.getSpecId() != null) {
            String[] split = BsGoods.getSpecId().split(",");
            List<String> strings = Arrays.asList(split);
            List<BsSpecs> bsSpecsList = bsSpecsService.findSpecs(strings);
            map.put("sku", bsSpecsList);
        }
        map.put("product", BsGoods);
        return new Result(true, 1, "查询成功", map);
    }



}
