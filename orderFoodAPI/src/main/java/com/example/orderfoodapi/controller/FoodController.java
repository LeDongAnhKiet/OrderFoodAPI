package com.example.orderfoodapi.controller;

import com.example.orderfoodapi.dto.FoodDTO;
import com.example.orderfoodapi.service.IFoodService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class FoodController {
    @Autowired
    private IFoodService foodService;
    @PostMapping("/food")
    public FoodDTO createNew(@RequestBody FoodDTO model) {

        return foodService.save(model);

    }
    @GetMapping("/food")
    public String test(){
        return "nhật ngu";
    }
}
