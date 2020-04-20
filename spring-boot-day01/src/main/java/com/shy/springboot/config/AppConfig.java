package com.shy.springboot.config;

import com.shy.springboot.pojo.User;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author 石皓岩
 * @create 2020-01-25 15:20
 * 描述：
 */
@Configuration
@ComponentScan(basePackages = "com.shy.springboot.*",
        excludeFilters = {
                @ComponentScan.Filter(classes = {
                Controller.class,
                RestController.class,
                Repository.class})})
public class AppConfig {

    @Bean
    public User user(){
        return new User().setId(2).setUsername("username1").setPassword("aaa1");
    }

}
