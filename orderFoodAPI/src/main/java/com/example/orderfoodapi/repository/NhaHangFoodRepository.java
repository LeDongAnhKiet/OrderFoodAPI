package com.example.orderfoodapi.repository;

import com.example.orderfoodapi.entity.Nhahang;
import com.example.orderfoodapi.entity.NhahangFood;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface NhaHangFoodRepository extends JpaRepository<NhahangFood,Integer> {

}
