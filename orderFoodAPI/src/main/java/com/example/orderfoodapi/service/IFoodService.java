package com.example.orderfoodapi.service;

import com.example.orderfoodapi.dto.FoodDTO;
import com.example.orderfoodapi.entity.Food;

import java.util.List;

public interface IFoodService {
    FoodDTO save(FoodDTO foodDTO);
    void delete(int[] ids);
    List<FoodDTO> findAll();
    FoodDTO getFoodByID(int id);
}