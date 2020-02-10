package com.hcx.controller;

import com.hcx.domain.User;
import com.hcx.mapper.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

/**
 * Created by hongcaixia on 2020/2/10.
 */
@Controller
public class UserController {

    @Autowired
    private UserMapper userMapper;

    @RequestMapping("/getUserList")
    @ResponseBody
    public List<User> getUserList(){
        List<User> users = userMapper.selectUserList();
        return users;
    }
}
