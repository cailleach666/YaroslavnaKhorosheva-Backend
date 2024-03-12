package com.example.server.controller;

import com.example.server.entity.UserDto;
import com.example.server.service.UserService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class UserController {
    private final UserService userService;
    public UserController(UserService userService){
        this.userService = userService;
    }
    @GetMapping("/users")
    public List<UserDto> getUsers(){
        return userService.getAllUsers();
    }
}
