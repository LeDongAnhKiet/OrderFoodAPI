package com.example.orderfoodapi.service;

import com.example.orderfoodapi.dto.ChitietdonhangDTO;

public interface IChiTietDonHangService {

    ChitietdonhangDTO save(ChitietdonhangDTO chiTietDonHangDTO);

    void delete(int[] ids);

}