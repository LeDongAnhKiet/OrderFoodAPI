package com.example.orderfoodapi.service;

import com.example.orderfoodapi.dto.DonhangDTO;

public interface IDonHangService {
    DonhangDTO save(DonhangDTO donhangDTO);
    void delete(int[] ids);
}
