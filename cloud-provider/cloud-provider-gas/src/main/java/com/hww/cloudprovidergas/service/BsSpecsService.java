package com.hww.cloudprovidergas.service;

import com.hww.common.entity.BsSpecs;

import java.util.List;
import java.util.Map;

public interface BsSpecsService {
    List<BsSpecs> findSpecs(List<String> id);
}
