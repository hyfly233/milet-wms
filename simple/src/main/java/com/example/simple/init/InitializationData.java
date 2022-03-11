package com.example.simple.init;

import com.example.simple.entity.*;
import com.example.simple.mapper.*;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class InitializationData implements InitializingBean {

    public static final String ROUTE_KEY = "basic:route:info";

    @Autowired
    RedisTemplate<String, Object> redisTemplate;

    @Autowired
    RouteMapper routeMapper;

    @Autowired
    StepMapper stepMapper;

    @Autowired
    AreaMapper areaMapper;

    @Autowired
    LocationMapper locationMapper;

    @Autowired
    PartMapper partMapper;

    @Override
    public void afterPropertiesSet() throws Exception {

        System.out.println("123123123123");

        List<Route> routes = routeMapper.selectAll();

        for (int i = 0; i < routes.size(); i++) {
            redisTemplate.opsForList().set(ROUTE_KEY, (i + 1), routes.get(i));
        }


        List<Step> steps = stepMapper.selectAll();

        List<Area> areas = areaMapper.selectAll();

        List<Location> locations = locationMapper.selectAll();

        List<Part> parts = partMapper.selectAll();

    }
}
