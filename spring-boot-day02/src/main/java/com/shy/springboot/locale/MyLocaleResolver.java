package com.shy.springboot.locale;

import com.shy.springboot.controller.UserController;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.util.StringUtils;
import org.springframework.web.servlet.LocaleResolver;

import javax.annotation.PostConstruct;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.Locale;

/**
 * @author 石皓岩
 * @create 2020-03-11 9:17
 * 描述：
 */
public class MyLocaleResolver implements LocaleResolver {
    private Logger logger = LoggerFactory.getLogger(UserController.class);

    @PostConstruct
    public void init() {
        logger.info(getClass().getName() + "实例化成功");
    }


    @Override
    public Locale resolveLocale(HttpServletRequest request) {
        String l = request.getParameter("l");
        Locale locale = Locale.getDefault();
        if (!StringUtils.isEmpty(l)) {
            String[] split = l.split("_");
            locale = new Locale(split[0], split[1]);
        }
        return locale;
    }

    @Override
    public void setLocale(HttpServletRequest request, HttpServletResponse response, Locale locale) {

    }
}
