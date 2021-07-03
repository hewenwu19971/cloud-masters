package com.hww.uc.controller;

import com.hww.common.Vo.PayVo;
import com.hww.common.base.Result;
import com.hww.common.entity.BsOrders;
import com.hww.uc.service.feign.MenberOrderFeignService;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixProperty;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/member/order")
public class MemberOrderController {
    @Autowired
    private MenberOrderFeignService menberOrderFeignService;

    @HystrixCommand(fallbackMethod = "error1",commandProperties = {
            @HystrixProperty(name = "circuitBreaker.enabled",value = "true"),  //是否开启断路器
            @HystrixProperty(name = "circuitBreaker.requestVolumeThreshold",value = "10"),   //请求次数
            @HystrixProperty(name = "circuitBreaker.sleepWindowInMilliseconds",value = "5000"),  //时间范围
            @HystrixProperty(name = "circuitBreaker.errorThresholdPercentage",value = "60"), //失败率达到多少后跳闸
    })
    @RequestMapping("/view")
    public Result orderView(@RequestBody PayVo payVo) {
     return menberOrderFeignService.orderDetail(payVo);
    }

    public Result error1(@RequestBody PayVo payVo) {
        return new Result(true,200,"熔断器触发",payVo);
    }

}
