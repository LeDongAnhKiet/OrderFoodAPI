package com.example.orderfoodapi.service.impl;

import com.example.orderfoodapi.Response.LoginMesage;
import com.example.orderfoodapi.Response.RegisterMessage;
import com.example.orderfoodapi.converter.UserConverter;
import com.example.orderfoodapi.dto.LoginDTO;
import com.example.orderfoodapi.dto.UserDTO;
import com.example.orderfoodapi.entity.User;
import com.example.orderfoodapi.repository.UserReponsitory;
import com.example.orderfoodapi.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class UserService implements IUserService {
    @Autowired
    private UserConverter userConverter;
    @Autowired
    private UserReponsitory userReponsitory;
    @Autowired
    private PasswordEncoder passwordEncoder;

    @Override
    public UserDTO save(UserDTO userDTO) {
        User user = new User();
        boolean check = true;
        List<User> listCheck = userReponsitory.findAll();

        if (userDTO.getId() != null) {
            User oldUser = userReponsitory.findUserById(userDTO.getId());
            user = userConverter.toEntity(userDTO, oldUser);
            listCheck.remove(oldUser);
        } else {
            user = userConverter.toEntity(userDTO);
        }
        for (User u : listCheck) {
            if (u.getTaiKhoan().equals(user.getTaiKhoan())) {
                check = false;
                break;
            }
        }
        if (check) {
            user = userReponsitory.save(user);
            return userConverter.toDTO(user);
        }
        else
            return null;

    }

    public RegisterMessage registerUser(UserDTO userDTO){
        if(userDTO == null){
            return new RegisterMessage("SignIn Failed", false);
        }
        else {
            return new RegisterMessage("SignIn Success", true);
        }
    }

    @Override
    public void delete(int[] ids) {
        for(int item: ids){
            userReponsitory.deleteById(item);
        }
    }

    @Override
    public LoginMesage loginUser(LoginDTO loginDTO) {
        String msg = "";
        User user1 = userReponsitory.findByTaiKhoan(loginDTO.getTaiKhoan());
        if (user1 != null) {
            String password = loginDTO.getMatKhau();
            String encodedPassword = user1.getMatKhau();
            Boolean isPwdRight = passwordEncoder.matches(password, encodedPassword);
            if (isPwdRight) {
                Optional<User> user = userReponsitory.findByTaiKhoanAndMatKhau(loginDTO.getTaiKhoan(),encodedPassword);
                if (user.isPresent()) {
                    return new LoginMesage("Login Success", true);
                } else {
                    return new LoginMesage("Login Failed", false);
                }
            } else {
                return new LoginMesage("password Not Match", false);
            }
        }else {
            return new LoginMesage("Email not exits", false);
        }
    }

}
