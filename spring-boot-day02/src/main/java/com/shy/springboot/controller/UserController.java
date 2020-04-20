package com.shy.springboot.controller;

import com.shy.springboot.beans.ResultMsg;
import com.shy.springboot.beans.User;
import com.shy.springboot.service.UserService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;

import javax.annotation.PostConstruct;
import javax.servlet.ServletContext;
import javax.servlet.http.HttpServletRequest;
import java.io.File;
import java.io.IOException;
import java.util.Map;

/**
 * @author 石皓岩
 * @create 2020-03-10 10:24
 * 描述：
 */
@Controller
public class UserController {
    private Logger logger = LoggerFactory.getLogger(UserController.class);

    @PostConstruct
    public void init() {
        logger.info(getClass().getName() + "实例化成功");
    }

    @Autowired
    private UserService userService;


    @RequestMapping("/hello")
    @ResponseBody
    public User hello(String aaa) throws Exception {
        if ("aaa".equals(aaa)) {
            throw new Exception("抛出异常");
        }
        logger.info("controller层执行成功");
        return new User().setId(1).setUsername("小明").setPassword("aaa");
    }

    @RequestMapping("/upload")
    @ResponseBody
    public String upload(MultipartFile file, HttpServletRequest request) throws IOException {
        String fileName = file.getOriginalFilename();
        ServletContext servletContext = request.getServletContext();
        String realPath = servletContext.getRealPath(File.separator);
        String contextPath = request.getContextPath();
        file.transferTo(new File("C:\\Users\\92346\\Desktop\\", fileName));
        return "文件上传成功";
    }

    @RequestMapping("/toLogin")
    public String login(Map<String, Object> map, HttpServletRequest request) {
        map.put("user", new User().setId(1).setUsername("小明").setPassword("aaa"));
        return "login";
    }

    @RequestMapping("/testData/{id}")
    @ResponseBody
    public ResultMsg testData(@PathVariable(required = true) Integer id) {

        User user = userService.get(id);

        return ResultMsg.ok(user);
    }


}
