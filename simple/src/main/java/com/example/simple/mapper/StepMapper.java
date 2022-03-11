package com.example.simple.mapper;

import com.example.simple.entity.Step;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface StepMapper {
    int deleteByPrimaryKey(Long id);

    int insert(Step record);

    int insertSelective(Step record);

    Step selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(Step record);

    int updateByPrimaryKey(Step record);

    List<Step> selectAll();
}