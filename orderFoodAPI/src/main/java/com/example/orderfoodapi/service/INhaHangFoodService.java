package com.example.orderfoodapi.service;

import com.example.orderfoodapi.dto.NhahangFoodDTO;

public interface INhaHangFoodService {
    NhahangFoodDTO save(NhahangFoodDTO nhahangFoodDTO);
    void delete(int[] ids);

}
