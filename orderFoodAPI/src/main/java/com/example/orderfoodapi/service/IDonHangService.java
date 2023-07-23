package com.example.orderfoodapi.service;

import com.example.orderfoodapi.dto.DonhangDTO;

import java.util.List;
import java.util.Map;

public interface IDonHangService {
    DonhangDTO save(DonhangDTO donhangDTO);
    void delete(int[] ids);

    DonhangDTO UpdateTrangThai(int id , Map<String,Object> obj);
    List<DonhangDTO> getAll();
}
