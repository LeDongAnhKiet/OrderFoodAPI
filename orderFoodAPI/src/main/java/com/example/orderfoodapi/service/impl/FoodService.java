package com.example.orderfoodapi.service.impl;

import com.example.orderfoodapi.converter.FoodConverter;
import com.example.orderfoodapi.dto.FoodDTO;
import com.example.orderfoodapi.entity.Food;
import com.example.orderfoodapi.entity.Loaifood;
import com.example.orderfoodapi.repository.FoodRepository;
import com.example.orderfoodapi.repository.LoaiFoodRepository;
import com.example.orderfoodapi.service.IFoodService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class FoodService implements IFoodService {
    @Autowired
    private FoodRepository foodRepository;
    @Autowired
    private LoaiFoodRepository loaiFoodRepository;
    @Autowired
    private FoodConverter foodConverter;
    @Override
    public FoodDTO save(FoodDTO foodDTO) {
        Loaifood loaifood = loaiFoodRepository.findLoaifoodById(foodDTO.getIdLoai());
        Food food = foodConverter.toEntity(foodDTO);
        food.setLoaifood(loaifood);
        food = foodRepository.save(food);
        return foodConverter.toDTO(food);
    }
}
