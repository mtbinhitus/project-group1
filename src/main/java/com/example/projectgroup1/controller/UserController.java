package com.example.projectgroup1.controller;

import com.example.projectgroup1.entity.Tour;
import com.example.projectgroup1.entity.User;
import com.example.projectgroup1.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
public class UserController {
    private UserService userService;

    public UserController(UserService userService) {
        this.userService = userService;
    }

    @GetMapping("/users")
    @ResponseBody
    public List<User> getAllUsers() {
        List<User> list =userService.getAllUser();
        return list;
    }

    @GetMapping("/users/{id}")
    @ResponseBody
    public Optional<User> getPostList(@PathVariable int id){
        Optional<User> list = userService.getUser(id);
        return list;
    }

}
