package com.example.orderfoodapi.controller;

import com.example.orderfoodapi.dto.FoodDTO;
import com.example.orderfoodapi.dto.NhahangDTO;
import com.example.orderfoodapi.service.INhaHangService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

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

    @GetMapping("/nhahang/{id}")
    public ResponseEntity<List<NhahangDTO>> findNhaHangByLoaiFood(@PathVariable("id") int id) {
        return ResponseEntity.ok().body(nhaHangService.getAllNhaHang(id));
    }

    @GetMapping("/nhahang/")
    public  ResponseEntity<List<NhahangDTO>> findALLNhaHang(){
        return ResponseEntity.ok().body((nhaHangService.getlist()));
    }
    @GetMapping("/nhahangtop/")
    public ResponseEntity<List<NhahangDTO>> getNhaHangTop() {
        return ResponseEntity.ok().body(nhaHangService.getListTop());
    }
}
