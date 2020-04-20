package com.shy.springboot.pojo;

import lombok.Data;
import lombok.experimental.Accessors;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

/**
 * @author 石皓岩
 * @create 2020-01-18 19:25
 * 描述：
 */
@Data
@Accessors(chain = true)
@Component("user")
public class User {
    /**
     * 用户id
     */
    @Value("1")
    private Integer id;
    /**
     * 用户名
     */
    @Value("aaa")
    private String username;
    /**
     * 用户密码
     */
    @Value("aaa")
    private String password;
}
