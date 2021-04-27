package com.fzu.rtmpdiscoveryclient.configure;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.redis.connection.RedisConnectionFactory;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.data.redis.serializer.RedisSerializer;

@Configuration
public class RedisConfig {
	@Bean
	public RedisTemplate redisTemplate(RedisConnectionFactory connectionFactory){
		RedisTemplate<String,Object> redisTemplate = new RedisTemplate<>();
		redisTemplate.setConnectionFactory(connectionFactory);
		redisTemplate.setDefaultSerializer(RedisSerializer.string());
		redisTemplate.setKeySerializer(RedisSerializer.string());
		redisTemplate.setValueSerializer(RedisSerializer.json());
		return redisTemplate;
	}
}
