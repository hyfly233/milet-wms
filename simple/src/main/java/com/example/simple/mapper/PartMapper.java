package com.example.simple.mapper;

import com.example.simple.entity.Part;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface PartMapper {
    int deleteByPrimaryKey(Long id);

    int insert(Part record);

    int insertSelective(Part record);

    Part selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(Part record);

    int updateByPrimaryKey(Part record);

    List<Part> selectAll();
}