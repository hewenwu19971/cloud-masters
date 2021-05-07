package com.hww.cloudprovidergas.service.impl;

import com.hww.cloudprovidergas.mapper.CartMapper;
import com.hww.cloudprovidergas.service.CartService;
import com.hww.common.Vo.CartVo;
import com.hww.common.entity.BsCart;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CartImpl implements CartService {
    @Autowired
    private CartMapper cartMapper;
    @Override
    public void addCart(BsCart cartVo) {
        cartMapper.insert(cartVo);
    }
}
