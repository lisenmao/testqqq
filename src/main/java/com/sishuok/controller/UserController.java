package com.sishuok.controller;

import com.sishuok.entity.User;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.scheduling.annotation.Async;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.util.Log4jConfigListener;

//@EnableAutoConfiguration
@RestController
@RequestMapping("/user")
public class UserController {
	@Autowired
	async async;

    @RequestMapping("/{id}")
    public User view(@PathVariable("id") Long id) {
        User user = new User();
        user.setId(id);
        user.setName("zhang");
        
        System.out.println("start");
        async.async1();
        System.out.println("end");
        return user;
    }

//    public static void main(String[] args) {
//        SpringApplication.run(UserController.class);
//    }

}
