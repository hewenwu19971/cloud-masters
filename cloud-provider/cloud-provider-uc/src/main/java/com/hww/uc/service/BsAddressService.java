package com.hww.uc.service;

import com.hww.common.entity.BsAddresses;

import java.util.List;

public interface BsAddressService {

    List<BsAddresses> getUserAddress(Long id);

    Integer addAddress(BsAddresses bsAddresses);

    BsAddresses getAddress(Long id);

    Integer deleteAddress(Long id);

    Integer updataAddress(BsAddresses bsAddresses);
}
