package com.example.orderfoodapi.repository;

import com.example.orderfoodapi.entity.Nhahang;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface NhaHangRepository extends JpaRepository<Nhahang,Integer> {
    Nhahang findNhahangById(int id);

}
