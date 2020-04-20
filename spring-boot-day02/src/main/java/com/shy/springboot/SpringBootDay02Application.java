package com.shy.springboot;

import org.mybatis.spring.annotation.MapperScan;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.annotation.EnableCaching;
import org.springframework.context.ConfigurableApplicationContext;

@MapperScan(value = {"com.shy.springboot.dao"})
@SpringBootApplication
@EnableCaching
public class SpringBootDay02Application {

    private static Logger logger = LoggerFactory.getLogger(SpringBootDay02Application.class);

    public static void main(String[] args) {
        ConfigurableApplicationContext run = SpringApplication.run(SpringBootDay02Application.class, args);
    }

}
