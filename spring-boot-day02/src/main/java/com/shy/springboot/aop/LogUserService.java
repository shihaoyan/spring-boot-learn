package com.shy.springboot.aop;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;

/**
 * @author 石皓岩
 * @create 2020-03-12 8:37
 * 描述：
 */
@Aspect
@Component
public class LogUserService {

    private Logger logger = LoggerFactory.getLogger(getClass());

    @PostConstruct
    public void init() {
        logger.info(getClass().getName() + "实例化成功");
    }


    @Pointcut("execution(* com.shy.springboot.service.*.*(..))")
    public void userServcieLog() {

    }


    @Around("userServcieLog()")
    public Object arouedUservice(ProceedingJoinPoint pj) {
        //拿到代理对象
        Object obj = pj.getThis();
        // 通过代理对象拿到本体对象，在拿到接口
        String log = obj.getClass().getSuperclass().getInterfaces()[0].getName();
        logger.debug(log + " 开始执行");
        Object o = null;
        try {
            o = pj.proceed();
            if(o!=null){
                logger.debug(o.toString());
            }else {
                logger.debug("null");
            }
        } catch (Throwable e) {
            e.printStackTrace();
        }
        String msg = log + " 执行成功";
        logger.debug(msg);
        return o;
    }


}
