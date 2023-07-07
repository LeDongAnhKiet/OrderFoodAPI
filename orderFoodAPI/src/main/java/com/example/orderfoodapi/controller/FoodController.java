package com.example.orderfoodapi.controller;

import com.example.orderfoodapi.dto.FoodDTO;
import com.example.orderfoodapi.entity.Food;
import com.example.orderfoodapi.repository.FoodRepository;
import com.example.orderfoodapi.service.IFoodService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
public class FoodController {
    @Autowired
    private IFoodService foodService;

    @Autowired
    private FoodRepository foodRepository;


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

    @GetMapping("/food")
    public ResponseEntity<List<FoodDTO>> getAllFood(){
        return ResponseEntity.ok().body(foodService.findAll());
    }

    @GetMapping("/food/{id}")
    public ResponseEntity<FoodDTO> findFoodByID(@PathVariable("id") int id) {
        return ResponseEntity.ok().body(foodService.getFoodByID(id));
    }
}