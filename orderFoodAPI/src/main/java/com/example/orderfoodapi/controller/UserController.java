package com.example.orderfoodapi.controller;


import com.example.orderfoodapi.dto.UserDTO;
import com.example.orderfoodapi.service.impl.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class UserController {
    @Autowired
    private UserService userService;
    @PostMapping("/user")
    public UserDTO createUser(@RequestBody UserDTO model) {

        return userService.save(model);

    }
    @PutMapping("/user/{id}")
    public UserDTO updateUser(@RequestBody UserDTO model, @PathVariable("id") int id){
        model.setId(id);
        return userService.save(model);
    }
    @DeleteMapping("/user")
    public void deleteUser(@RequestBody int[] ids){
        userService.delete(ids);
    }
}
