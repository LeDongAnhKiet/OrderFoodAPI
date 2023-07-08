package com.example.orderfoodapi.controller;

import com.example.orderfoodapi.dto.DonhangDTO;
import com.example.orderfoodapi.dto.LoaifoodDTO;
import com.example.orderfoodapi.dto.NhahangFoodDTO;
import com.example.orderfoodapi.entity.NhahangFood;
import com.example.orderfoodapi.service.impl.NhaHangFoodService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class NhaHangFoodController {
    @Autowired
    NhaHangFoodService nhaHangFoodService;

    @PostMapping("/nha_hang_food")
    public NhahangFoodDTO create(@RequestBody NhahangFoodDTO model) {
        return nhaHangFoodService.save(model);
    }

    @PutMapping("/nha_hang_food/{id}")
    public NhahangFoodDTO update(@RequestBody NhahangFoodDTO model, @PathVariable("id") int id){
        model.setId(id);
        return nhaHangFoodService.save(model);
    }

    @DeleteMapping("/nha_hang_food")
    public  void  delete(@RequestBody int[] ids){
        nhaHangFoodService.delete(ids);
    }
}
