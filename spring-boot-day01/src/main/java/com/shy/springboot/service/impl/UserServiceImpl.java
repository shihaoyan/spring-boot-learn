package com.shy.springboot.service.impl;

import com.shy.springboot.dao.UserDao;
import com.shy.springboot.pojo.User;
import com.shy.springboot.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author 石皓岩
 * @create 2020-01-18 19:39
 * 描述：
 */
@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserDao userDao;

    @Override
    public User get(Integer id) {
        return userDao.get(id);
    }

    @Override
    public List<User> list() {
        return userDao.list();
    }

    @Override
    public boolean add(User user) {
        return userDao.add(user);
    }

    @Override
    public boolean delete(Integer id) {
        return userDao.delete(id);
    }
}
