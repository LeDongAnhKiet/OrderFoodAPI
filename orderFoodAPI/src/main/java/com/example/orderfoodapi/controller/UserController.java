package com.example.orderfoodapi.controller;

import com.example.orderfoodapi.dto.FoodDTO;
import com.example.orderfoodapi.dto.UserDTO;
import com.example.orderfoodapi.service.impl.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {
    @Autowired
    private UserService userService;
    @PostMapping("/user")
    public UserDTO createNew(@RequestBody UserDTO model) {

        return userService.save(model);

    }
}
