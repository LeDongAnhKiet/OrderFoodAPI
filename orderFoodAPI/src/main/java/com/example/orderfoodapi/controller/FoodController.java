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
    public FoodDTO createFood(@RequestBody FoodDTO model) {

        return foodService.save(model);

    }
    @PutMapping ("/food/{id}")
    public FoodDTO updateFood(@RequestBody FoodDTO model, @PathVariable("id") int id)
    {
        model.setId(id);
        return foodService.save(model);
    }
    @DeleteMapping("/food")
    public void deleteFood (@RequestBody int[] ids)
    {
        foodService.delete(ids);
    }
}
