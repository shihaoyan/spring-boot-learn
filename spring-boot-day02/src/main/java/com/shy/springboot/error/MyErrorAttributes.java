package com.shy.springboot.error;

import com.shy.springboot.controller.UserController;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.web.servlet.error.DefaultErrorAttributes;
import org.springframework.stereotype.Component;
import org.springframework.web.context.request.WebRequest;

import javax.annotation.PostConstruct;
import java.util.Map;

/**
 * @author 石皓岩
 * @create 2020-03-11 19:50
 * 描述：
 */
@Component
public class MyErrorAttributes extends DefaultErrorAttributes {
    private Logger logger = LoggerFactory.getLogger(UserController.class);

    @PostConstruct
    public void init() {
        logger.info(getClass().getName() + "实例化成功");
    }

    @Override
    public Map<String, Object> getErrorAttributes(WebRequest webRequest, boolean includeStackTrace) {
        Map<String, Object> map = super.getErrorAttributes(webRequest, includeStackTrace);
        //map.put("msg","出现错误信息");
        return map;
    }
}
