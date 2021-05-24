package com.hww.orders.service;

import com.hww.common.entity.BsAddresses;

import java.util.List;

public interface AddressesService {
    BsAddresses getByAddressesId(Long Id);
    BsAddresses findAddressById(String Id);
}
