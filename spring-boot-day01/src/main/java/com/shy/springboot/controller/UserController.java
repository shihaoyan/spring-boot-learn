package com.shy.springboot.controller;

import com.shy.springboot.pojo.User;
import com.shy.springboot.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;
import java.util.Map;

/**
 * @author 石皓岩
 * @create 2020-01-18 19:22
 * 描述：
 */
@Controller
public class UserController {

    @Autowired
    private UserService userService;

    @GetMapping("/user/{id}")
    @ResponseBody
    public User get(@PathVariable Integer id){

        return userService.get(id);
    }
    @RequestMapping("/index")
    public String index(Map map){

        List<User> list = userService.list();
        map.put("list",list);
        return "index";
    }



}
