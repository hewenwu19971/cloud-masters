package com.hww.uc.service.feign;

import com.hww.common.Vo.PayVo;
import com.hww.common.base.Result;
import com.hww.common.entity.BsOrders;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

@Component
@FeignClient(value = "CLOUD-PROVIDER-ORDERS")
public interface MenberOrderFeignService {

    @PostMapping("/api/order/view")
     Result orderDetail(@RequestBody PayVo payVo);
}
