package com.example.orderfoodapi.service;

import com.example.orderfoodapi.dto.UudaiDTO;
import com.example.orderfoodapi.entity.Uudai;

public interface IUuDaiService {
    UudaiDTO save(UudaiDTO uudaiDTO);
    void delete(int[] id);
}
