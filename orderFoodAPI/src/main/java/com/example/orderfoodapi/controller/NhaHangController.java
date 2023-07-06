package com.example.orderfoodapi.controller;

import com.example.orderfoodapi.dto.NhahangDTO;
import com.example.orderfoodapi.service.INhaHangService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class NhaHangController {
    @Autowired
    private INhaHangService nhaHangService;
    @PostMapping("/nhahang")
    public NhahangDTO create(@RequestBody NhahangDTO model){
        return nhaHangService.save(model);
    }

    @PutMapping("/nhahang/{id}")
    public NhahangDTO updateNhahang(@RequestBody NhahangDTO model, @PathVariable("id") int id)
    {
        model.setId(id);
        return nhaHangService.save(model);
    }
    @DeleteMapping("/nhahang")
    public void deleteNhahang(@RequestBody int[] ids)
    {
        nhaHangService.delete(ids);
    }
}
