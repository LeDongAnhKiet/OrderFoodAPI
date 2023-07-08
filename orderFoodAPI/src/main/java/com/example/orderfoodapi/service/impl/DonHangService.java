package com.example.orderfoodapi.service.impl;

import com.example.orderfoodapi.converter.DonHangConVerter;
import com.example.orderfoodapi.dto.DonhangDTO;
import com.example.orderfoodapi.entity.Danhgia;
import com.example.orderfoodapi.entity.Donhang;

import com.example.orderfoodapi.entity.User;
import com.example.orderfoodapi.repository.DonHangRepository;

import com.example.orderfoodapi.repository.UserReponsitory;
import com.example.orderfoodapi.service.IDonHangService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class DonHangService implements IDonHangService {

    @Autowired
    DonHangRepository donHangRepository;

    @Autowired
    UserReponsitory userReponsitory;

    @Autowired
    DonHangConVerter donHangConVerter;



    @Override
    public DonhangDTO save(DonhangDTO donhangDTO) {
        Donhang donhang = new Donhang();
        if (donhangDTO.getId() != null) {
            Donhang oldDonHang= donHangRepository.findDonHangById(donhangDTO.getId());
            donhang = donHangConVerter.toEntity(donhangDTO, oldDonHang);
        } else donhang = donHangConVerter.toEntity(donhangDTO);
        User user = userReponsitory.findUserById(donhangDTO.getIdUser());
        donhang.setUser(user);
        donhang = donHangRepository.save(donhang);
        return donHangConVerter.toDTO(donhang);
    }

    @Override
    public void delete(int[] ids) {
        for (int item : ids) {
            donHangRepository.deleteById(item);
        }
    }
}
