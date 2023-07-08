package com.example.orderfoodapi.repository;

import com.example.orderfoodapi.entity.Danhgia;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DanhGiaRepository extends JpaRepository<Danhgia,Integer> {
    Danhgia findDanhGiaById(int id);
}
