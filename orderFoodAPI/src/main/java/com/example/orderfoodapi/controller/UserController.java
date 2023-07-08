package com.example.orderfoodapi.controller;


import com.example.orderfoodapi.Response.LoginMesage;
import com.example.orderfoodapi.Response.RegisterMessage;
import com.example.orderfoodapi.dto.LoginDTO;
import com.example.orderfoodapi.dto.UserDTO;
import com.example.orderfoodapi.service.impl.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@CrossOrigin
public class UserController {
    @Autowired
    private UserService userService;
    @PostMapping("/user")
    public UserDTO createUser(@RequestBody UserDTO model) {
        return userService.save(model);
    }

    @PostMapping("/register")
    public ResponseEntity<?> register(@RequestBody UserDTO model){
        RegisterMessage registerMessage = userService.registerUser(userService.save(model));
        return  ResponseEntity.ok(registerMessage);
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

    @PostMapping("/login")
    public ResponseEntity<?> login (@RequestBody LoginDTO loginDTO)
    {
        LoginMesage loginMesage = userService.loginUser(loginDTO);
        return ResponseEntity.ok(loginMesage);
    }
}
