package com.hww.orders.ordercontroller;

import com.hww.common.base.Result;
import com.hww.common.entity.BsCart;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/order")
public class OrderController {

    @RequestMapping("/confirm")
    public Result confinrm(@RequestBody BsCart bsCart) {
        return new Result(true, 1, "成功");
    }
}
