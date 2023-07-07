package com.example.orderfoodapi.service.impl;

import com.example.orderfoodapi.converter.ChiTietDonHangConverter;
import com.example.orderfoodapi.dto.ChitietdonhangDTO;
import com.example.orderfoodapi.entity.*;
import com.example.orderfoodapi.repository.ChiTietDonHangRepository;
import com.example.orderfoodapi.repository.DonHangRepository;
import com.example.orderfoodapi.repository.NhaHangFoodRepository;
import com.example.orderfoodapi.service.IChiTietDonHangService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ChiTietDonHangService implements IChiTietDonHangService {

    @Autowired
    ChiTietDonHangRepository chiTietDonHangRepository;
    @Autowired
    ChiTietDonHangConverter chiTietDonHangConverter;
    @Autowired
    DonHangRepository donHangRepository;
    @Autowired
    NhaHangFoodRepository nhaHangFoodRepository;

    @Override
    public ChitietdonhangDTO save(ChitietdonhangDTO chitietdonhangDTO) {
        Chitietdonhang chitietdonhang = new Chitietdonhang();
        if (chitietdonhangDTO.getId() != null) {
            Chitietdonhang oldChitietdonhang = chiTietDonHangRepository.findChiTietDonHangById(chitietdonhangDTO.getId());
            chitietdonhang = chiTietDonHangConverter.toEntity(chitietdonhangDTO, oldChitietdonhang);
        } else chitietdonhang = chiTietDonHangConverter.toEntity(chitietdonhangDTO);
        Donhang donhang = donHangRepository.findDonHangById(chitietdonhangDTO.getIdDonHang());
        chitietdonhang.setDonhang(donhang);
        NhahangFood nhaHangFood = nhaHangFoodRepository.findNhahangFoodById(chitietdonhangDTO.getIdNhaHangFood());
        chitietdonhang.setNhahangFood(nhaHangFood);
        chitietdonhang = chiTietDonHangRepository.save(chitietdonhang);
        return chiTietDonHangConverter.toDTO(chitietdonhang);
    }

    @Override
    public void delete(int[] ids) {
        for (int item : ids) {
            chiTietDonHangRepository.deleteById(item);
        }
    }
}
