package com.kbds.wcyyxh.controller;

import com.kbds.wcyyxh.entity.Users;
import com.kbds.wcyyxh.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by Chris on 2017-07-17.
 */
@RestController
public class UserController {

    @Autowired
    private UserService userService;

    @RequestMapping("/test/{id}")
    public Users getAll(@PathVariable Integer id){
       return userService.getAll(id);
    }
}
