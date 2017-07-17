package com.kbds.wcyyxh.config;

import org.apache.catalina.mapper.Mapper;
import org.mybatis.spring.mapper.MapperScannerConfigurer;
import org.springframework.boot.autoconfigure.AutoConfigureAfter;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

import java.util.Properties;

/**
 * Created by Chris on 2017-07-17.
 */
@Configuration
//由于MapperScannerConfig执行的比较早，所以需要下面的这个注解
@AutoConfigureAfter
@Scope("prototype")
public class MyBatisMapperScannerConfig {

    @Bean
    public MapperScannerConfigurer mapperScannerConfigurer(){
        MapperScannerConfigurer mapperScannerConfigurer = new MapperScannerConfigurer();
        mapperScannerConfigurer.setSqlSessionFactoryBeanName("sqlSessionFactory");
        mapperScannerConfigurer.setBasePackage("com.kbds.wcyyxh.dao");
        return mapperScannerConfigurer;

    }
}
