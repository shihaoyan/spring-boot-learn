package com.shy.springboot;

import com.shy.springboot.config.WebConfig;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class SpringBootDay01Application {

    public static void main(String[] args) {
        ApplicationContext ctx = SpringApplication.run(new Class[]{SpringBootDay01Application.class, WebConfig.class}, args);

    }

}
