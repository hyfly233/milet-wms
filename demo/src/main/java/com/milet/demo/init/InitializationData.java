package com.milet.demo.init;

import com.milet.demo.entity.ProductionLine;
import com.milet.demo.mapper.ProductionLineMapper;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
@Slf4j
public class InitializationData implements InitializingBean {

    @Autowired
    RedisTemplate<String, Object> redisTemplate;

    @Autowired
    ProductionLineMapper productionLineMapper;

    @Override
    public void afterPropertiesSet() throws Exception {
        List<ProductionLine> productionLines = productionLineMapper.selectList(null);


    }
}
