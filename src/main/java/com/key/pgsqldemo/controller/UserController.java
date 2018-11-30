package com.key.pgsqldemo.controller;

import com.key.pgsqldemo.entity.User;
import com.key.pgsqldemo.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/user")
public class UserController {

    @Autowired
    private IUserService userService;

    @PostMapping("/userInsert")
    public Integer userInsert(User user){
        return userService.save(user);
    }

    @PostMapping("/queryById")
    public User queryById(Integer id){
        return userService.findUserById(id);
    }
}
