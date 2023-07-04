package com.example.orderfoodapi.repository;

import com.example.orderfoodapi.entity.Donhang;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DonHangRepository extends JpaRepository<Donhang,Integer> {
}
