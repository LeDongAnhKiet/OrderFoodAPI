package com.example.orderfoodapi.service.impl;

import com.example.orderfoodapi.converter.DanhGiaConverter;
import com.example.orderfoodapi.dto.DanhgiaDTO;
import com.example.orderfoodapi.entity.Danhgia;
import com.example.orderfoodapi.entity.NhahangFood;
import com.example.orderfoodapi.entity.User;
import com.example.orderfoodapi.repository.DanhGiaRepository;
import com.example.orderfoodapi.repository.NhaHangFoodRepository;
import com.example.orderfoodapi.repository.UserReponsitory;
import com.example.orderfoodapi.service.IDanhGiaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class DanhGiaService implements IDanhGiaService {

    @Autowired
    private DanhGiaRepository danhGiaRepository;
    @Autowired
    private DanhGiaConverter danhGiaConverter;
    @Autowired
    private UserReponsitory userReponsitory;
    @Autowired
    private NhaHangFoodRepository nhaHangFoodRepository;

    @Override
    public DanhgiaDTO save(DanhgiaDTO danhgiaDTO) {
        Danhgia danhgia = new Danhgia();
        if (danhgiaDTO.getId() != null) {
            Danhgia oldDanhgia = danhGiaRepository.findDanhGiaById(danhgiaDTO.getId());
            danhgia = danhGiaConverter.toEntity(danhgiaDTO, oldDanhgia);
        } else danhgia = danhGiaConverter.toEntity(danhgiaDTO);
        User user = userReponsitory.findUserById(danhgiaDTO.getIdUser());
        danhgia.setUser(user);
        NhahangFood nhaHangFood = nhaHangFoodRepository.findNhahangFoodById(danhgiaDTO.getIdNhaHangFood());
        danhgia.setNhahangFood(nhaHangFood);
        danhgia = danhGiaRepository.save(danhgia);
        return danhGiaConverter.toDTO(danhgia);
    }

    @Override
    public void delete(int[] ids) {
        for (int item : ids) {
            danhGiaRepository.deleteById(item);
        }
    }
}
