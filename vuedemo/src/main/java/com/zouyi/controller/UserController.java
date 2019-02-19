package com.zouyi.controller;

import com.zouyi.domain.User;
import com.zouyi.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @author 邹义(Dimo)
 * @date 2019/02/18 16:39
 **/
@RestController
@RequestMapping("/user")
public class UserController {
    @Autowired
    private UserService userService;

    @RequestMapping("/findAll")
    public List<User> findAll(){
        return userService.findAll();
    }

    @RequestMapping("/findOne/{id}")
    public User findOne(@PathVariable("id") Integer id){
        return userService.findOne(id);
    }

    @RequestMapping("/update")
    public void update(@RequestBody User user){
        userService.update(user);
    }

}
