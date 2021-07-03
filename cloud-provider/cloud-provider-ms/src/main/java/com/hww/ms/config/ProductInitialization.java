package com.hww.ms.config;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.toolkit.Wrappers;
import com.hww.common.entity.BsGoods;
import com.hww.ms.mapper.GoodsMapper;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.stereotype.Component;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Component
public class ProductInitialization implements InitializingBean {
    @Autowired
    private RedisTemplate redisTemplate;
    @Autowired
    private GoodsMapper goodsMapper;

    @Override
    public void afterPropertiesSet() throws Exception {
        QueryWrapper<BsGoods> query = Wrappers.query();
        query.eq("sale_status", 1);
        List<BsGoods> bsGoods = goodsMapper.selectList(query);
        Map<Object, Object> map = new HashMap<>();
        for (BsGoods bsGood : bsGoods) {
            map.put(bsGood.getId(), false);
        }
    }
}
