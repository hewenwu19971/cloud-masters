package com.hww.cloudprovidergas.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.hww.common.entity.BsSpecs;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface BsSpecsMapper extends BaseMapper<BsSpecs> {

    List<BsSpecs> queryBsSpecs(List<String> id);
}
