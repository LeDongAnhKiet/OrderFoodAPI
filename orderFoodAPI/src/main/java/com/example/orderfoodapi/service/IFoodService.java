package com.example.orderfoodapi.service;

import com.example.orderfoodapi.dto.FoodDTO;

public interface IFoodService {
    FoodDTO save(FoodDTO foodDTO);
    void delete(int[] ids);
}
