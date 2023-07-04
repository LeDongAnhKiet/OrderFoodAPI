package com.example.orderfoodapi.converter;

import com.example.orderfoodapi.dto.UserDTO;
import com.example.orderfoodapi.entity.User;
import org.springframework.stereotype.Component;

@Component
public class UserConverter {
    public User toEntity (UserDTO userDTO)
    {
        User user = new User();
        user.setId(userDTO.getId());
        user.setTaiKhoan(userDTO.getTaiKhoan());
        user.setMatKhau(userDTO.getMatKhau());
        user.setDiaChi(userDTO.getDiaChi());
        user.setSoDienThoai(userDTO.getSoDienThoai());
        user.setQuyen(userDTO.getQuyen());
        user.setEmail(userDTO.getEmail());
        user.setAvatar(userDTO.getAvatar());
        return user;
    }

    public UserDTO toDTO (User entity)
    {
        UserDTO user = new UserDTO();
        user.setId(entity.getId());
        user.setTaiKhoan(entity.getTaiKhoan());
        user.setMatKhau(entity.getMatKhau());
        user.setDiaChi(entity.getDiaChi());
        user.setSoDienThoai(entity.getSoDienThoai());
        user.setQuyen(entity.getQuyen());
        user.setEmail(entity.getEmail());
        user.setAvatar(entity.getAvatar());
        return user;
    }
}
