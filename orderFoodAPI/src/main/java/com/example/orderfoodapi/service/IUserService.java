package com.example.orderfoodapi.service;

import com.example.orderfoodapi.Response.LoginMesage;
import com.example.orderfoodapi.dto.LoginDTO;
import com.example.orderfoodapi.dto.UserDTO;

public interface IUserService {
    UserDTO save(UserDTO userDTO);
    void delete (int[] ids);

    UserDTO loginUser(LoginDTO loginDTO);
}
