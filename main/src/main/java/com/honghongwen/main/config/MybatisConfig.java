package com.honghongwen.main.config;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.context.annotation.Configuration;

/**
 * @author fengwen
 * @date 2020-12-25
 * Mybatis Config
 */
@Configuration
@MapperScan({"com.honghongwen.main.mapper", "com.honghongwen.main.mbg.mapper"})
public class MybatisConfig {

}
