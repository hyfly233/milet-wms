package com.milet.demo.config;

import com.alibaba.fastjson.support.spring.GenericFastJsonRedisSerializer;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.redis.connection.RedisConnectionFactory;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.data.redis.serializer.GenericToStringSerializer;

@Configuration
public class RedisConfig {

    @Bean
    public RedisTemplate<String, Object> redisTemplate(RedisConnectionFactory factory) {
        RedisTemplate<String, Object> template = new RedisTemplate<>();
        template.setConnectionFactory(factory);

        GenericFastJsonRedisSerializer serializer = new GenericFastJsonRedisSerializer();

        // 设置key和value的序列化规则
        template.setKeySerializer(new GenericToStringSerializer<>(Object.class));
        template.setValueSerializer(serializer);

        // 设置hashKey和hashValue的序列化规则
        template.setHashKeySerializer(new GenericToStringSerializer<>(Object.class));
        template.setHashValueSerializer(serializer);
        
        // 设置支持事物
        template.setEnableTransactionSupport(true);
        template.afterPropertiesSet();

        return template;
    }
}
