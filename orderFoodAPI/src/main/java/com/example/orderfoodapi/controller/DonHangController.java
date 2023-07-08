package com.example.orderfoodapi.controller;




import com.example.orderfoodapi.dto.DonhangDTO;
import com.example.orderfoodapi.service.impl.DonHangService;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.web.bind.annotation.*;

@RestController
public class DonHangController {
    @Autowired
    DonHangService donHangService;
    @PostMapping("/donhang")
    public DonhangDTO create(@RequestBody DonhangDTO model) {
        return donHangService.save(model);
    }
    @PutMapping("/donhang/{id}")
    public DonhangDTO update(@RequestBody DonhangDTO model, @PathVariable("id") int id) {
        model.setId(id);
        return donHangService.save(model);
    }

    @DeleteMapping("/donhang")
    public void delete (@RequestBody int[] ids) { donHangService.delete(ids); }


}
