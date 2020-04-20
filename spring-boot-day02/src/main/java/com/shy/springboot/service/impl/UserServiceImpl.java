package com.shy.springboot.service.impl;

import com.shy.springboot.beans.User;
import com.shy.springboot.dao.UserDao;
import com.shy.springboot.service.UserService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;

/**
 * @author 石皓岩
 * @create 2020-03-12 8:31
 * 描述：
 */
@Service
public class UserServiceImpl implements UserService {

    private Logger logger = LoggerFactory.getLogger(getClass());

    @PostConstruct
    public void init(){
        logger.info(getClass().getInterfaces()[0].getName()+"实例化成功");
    }



    private UserDao userDao = null;

    @Override
    public User get(Integer id) {
        if (id == null) {
            id = 1;
        }
        return userDao.get(id);
    }
}
