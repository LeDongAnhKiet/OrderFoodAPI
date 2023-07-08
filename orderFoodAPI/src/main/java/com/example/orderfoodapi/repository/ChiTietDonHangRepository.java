package com.example.orderfoodapi.repository;

import com.example.orderfoodapi.entity.Chitietdonhang;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ChiTietDonHangRepository extends JpaRepository<Chitietdonhang,Integer> {
    Chitietdonhang findChiTietDonHangById(int id);
}
