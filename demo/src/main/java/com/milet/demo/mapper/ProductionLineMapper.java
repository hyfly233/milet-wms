package com.milet.demo.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.milet.demo.entity.ProductionLine;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface ProductionLineMapper extends BaseMapper<ProductionLine> {
}