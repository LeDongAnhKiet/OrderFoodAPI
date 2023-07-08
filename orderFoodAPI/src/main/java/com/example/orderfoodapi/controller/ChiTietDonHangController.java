package com.example.orderfoodapi.controller;

import com.example.orderfoodapi.dto.ChitietdonhangDTO;
import com.example.orderfoodapi.service.impl.ChiTietDonHangService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class ChiTietDonHangController {

    @Autowired
    private ChiTietDonHangService chiTietDonHangService;

    @PostMapping("/chi_tiet")
    public ChitietdonhangDTO createChiTietDonHang(@RequestBody ChitietdonhangDTO model) {
        return chiTietDonHangService.save(model);
    }

    @PutMapping("/chi_tiet/{id}")
    public ChitietdonhangDTO updateChiTietDonHang(@RequestBody ChitietdonhangDTO model, @PathVariable("id") int id) {
        model.setId(id);
        return chiTietDonHangService.save(model);
    }

    @DeleteMapping("/chi_tiet")
    public void deleteChiTietDonHang (@RequestBody int[] ids) { chiTietDonHangService.delete(ids); }
}
