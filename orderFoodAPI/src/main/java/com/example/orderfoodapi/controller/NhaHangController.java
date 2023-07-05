package com.example.orderfoodapi.controller;

import com.example.orderfoodapi.dto.NhahangDTO;
import com.example.orderfoodapi.service.INhaHangService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class NhaHangController {
    @Autowired
    private INhaHangService nhaHangService;
    @PostMapping("/nhahang")
    public NhahangDTO create(@RequestBody NhahangDTO model){
        return nhaHangService.save(model);
    }
}
