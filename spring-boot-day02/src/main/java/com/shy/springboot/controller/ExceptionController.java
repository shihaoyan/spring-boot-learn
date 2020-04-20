package com.shy.springboot.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

import javax.annotation.PostConstruct;
import javax.servlet.http.HttpServletRequest;

/**
 * @author 石皓岩
 * @create 2020-03-10 20:02
 * 描述：
 */
@ControllerAdvice
public class ExceptionController {
    private Logger logger = LoggerFactory.getLogger(getClass());

    @PostConstruct
    public void init() {
        logger.info(getClass().getName() + "实例化成功");
    }


    @ExceptionHandler(Exception.class)
    public String exception(Exception ex, HttpServletRequest request) {
        ex.printStackTrace();
        request.setAttribute("javax.servlet.error.status_code", 400);
        return "forward:/error";
    }

}
