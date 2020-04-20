package com.shy.springboot.dao;

import com.shy.springboot.pojo.User;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

/**
 * @author 石皓岩
 * @create 2020-01-18 19:27
 * 描述：
 */
@Repository
public class UserDao {

    /**
     * 模拟数据
     */
    List<User> users = new ArrayList();

    {
        users.add(new User().setId(1).setUsername("aaa").setPassword("aaa"));
        users.add(new User().setId(2).setUsername("bbb").setPassword("bbb"));
        users.add(new User().setId(3).setUsername("ccc").setPassword("ccc"));
        users.add(new User().setId(4).setUsername("ddd").setPassword("ddd"));
        users.add(new User().setId(5).setUsername("eee").setPassword("eee"));
    }

    /**
     * 通过id获取用户
     *
     * @param id
     * @return
     */
    public User get(Integer id) {
        for (User user : users) {
            if (user.getId().equals(id)) {
                return user;
            }
        }
        return null;
    }

    /**
     * 获取所有的用户集合
     */
    public List<User> list() {
        return users;
    }

    /**
     * 添加用户
     */
    public boolean add(User user) {
        boolean isOk = users.add(user);
        return isOk;
    }

    /**
     * 删除用户
     */
    public boolean delete(Integer id) {
        for (int i = 0; i < users.size(); i++) {
            if (users.get(i).getId().equals(id)) {
                User user = users.remove(i);
                if (user != null)
                    return true;
            }
        }
        return false;
    }


}
