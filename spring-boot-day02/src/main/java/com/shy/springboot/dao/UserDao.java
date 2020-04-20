package com.shy.springboot.dao;

import com.shy.springboot.beans.User;
import org.apache.ibatis.annotations.Select;

/**
 * @author 石皓岩
 * @create 2020-03-11 20:00
 * 描述：
 */
//@Repository
public interface UserDao {

    /**
     * 根据id查询用户信息
     * @param id
     * @return
     */
    @Select("select id,username,password from tb_user where id = #{id}")
    User get(Integer id);


}
