package com.example.orderfoodapi.service;

import com.example.orderfoodapi.dto.DanhgiaDTO;

public interface IDanhGiaService {

    DanhgiaDTO save(DanhgiaDTO danhgiaDTO);

    void delete(int[] ids);

}
