package com.hww.orders.service;

import com.hww.common.Vo.PayVo;
import com.hww.common.entity.BsMembers;
import com.hww.common.entity.TSysUser;

public interface MemmberService {

    BsMembers findPayPwdByUserId(Long id);

    Integer payment(PayVo payVo, TSysUser tSysUser, Long userId);
}
