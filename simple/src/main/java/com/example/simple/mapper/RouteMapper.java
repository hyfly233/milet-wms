package com.example.simple.mapper;

import com.example.simple.entity.Route;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface RouteMapper {
    int deleteByPrimaryKey(Long id);

    int insert(Route record);

    int insertSelective(Route record);

    Route selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(Route record);

    int updateByPrimaryKey(Route record);

    List<Route> selectAll();
}