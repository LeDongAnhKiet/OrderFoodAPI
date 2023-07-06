package com.example.orderfoodapi.repository;

import com.example.orderfoodapi.dto.FoodDTO;
import com.example.orderfoodapi.entity.Food;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface FoodRepository extends JpaRepository<Food,Integer> {
    Food findFoodById(int id);
}
