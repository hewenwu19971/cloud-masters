package com.hww.ms.controller;

import com.google.common.util.concurrent.RateLimiter;
import com.hww.common.entity.BsGoods;
import com.hww.ms.service.impl.GoodsServiceImpl;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.sql.Time;
import java.util.concurrent.TimeUnit;

@Slf4j
@RestController()
public class MSController {

    @Autowired
    private GoodsServiceImpl goodsService;
    @Autowired
    private RedisTemplate redisTemplate;
    // 1秒处理0.5个请求，2秒处理1个请求 -- 原理：令牌桶保存在内存当中
    private final static RateLimiter rateLimiter = RateLimiter.create(99);

    @RequestMapping("/toIndex/{id}")
    public String toIndexHtml(@PathVariable("id") Long id) {
        // 获取令牌
        boolean tryAcquire = rateLimiter.tryAcquire(2, TimeUnit.SECONDS);
        if (!tryAcquire) { // 限流
            log.info("请稍后访问...{}", rateLimiter.acquire());
            return "请稍后访问...";
        }
        BsGoods byGoodsId = goodsService.findByGoodsId(id);
        Boolean lock = redisTemplate.opsForValue().setIfAbsent("lock", "value", 15, TimeUnit.SECONDS);
        if (lock) {
            try {
                log.info("库存{}", byGoodsId.getGoodStock());
                if (byGoodsId.getGoodStock() <= 0) {
                    return "卖完";
                }
                byGoodsId.setGoodStock(byGoodsId.getGoodStock() - 1);
                goodsService.deductionOfInventory(byGoodsId);
                log.info("成功{}", rateLimiter.acquire());
            } finally {
                redisTemplate.delete("lock");
            }
        }
        return "成功";
    }
}
