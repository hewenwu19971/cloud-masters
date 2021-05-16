package com.hww.orders.service;

import com.hww.common.Vo.PayVo;
import com.hww.common.entity.BsMembers;

public interface MemmberService {

    BsMembers findPayPwdByUserId(int id);

    Integer payment(PayVo payVo, BsMembers balance, int userId);
}
