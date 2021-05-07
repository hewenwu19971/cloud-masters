package com.hww.cloudprovidergas.controller;

import com.hww.cloudprovidergas.service.impl.CartImpl;
import com.hww.common.Vo.CartVo;
import com.hww.common.base.Result;
import com.hww.common.entity.BsCart;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/cart")
public class CartController {

    @Autowired
    private CartImpl cartService;

    @PostMapping("/add")
    public Result addCart(@RequestBody BsCart cartVo){
        cartService.addCart(cartVo);
        return new Result(true,1,"成功");
    }
}
