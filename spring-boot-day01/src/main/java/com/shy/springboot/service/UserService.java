package com.shy.springboot.service;

import com.shy.springboot.pojo.User;

import java.util.List;

/**
 * @author 石皓岩
 * @create 2020-01-18 19:38
 * 描述：
 */
public interface UserService {


    /**
     * 通过id获取用户
     *
     * @param id
     * @return
     */
    User get(Integer id);

    /**
     * 获取所有的用户集合
     */
    List<User> list();

    /**
     * 添加用户
     */
    boolean add(User user);

    /**
     * 删除用户
     */
    boolean delete(Integer id);

}


