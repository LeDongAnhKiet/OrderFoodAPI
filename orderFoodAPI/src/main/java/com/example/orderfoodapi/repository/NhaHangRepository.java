package com.example.orderfoodapi.repository;

import com.example.orderfoodapi.entity.Nhahang;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface NhaHangRepository extends JpaRepository<Nhahang,Integer> {
    Nhahang findNhahangById(int id);

    @Query("SELECT a FROM Nhahang a join NhahangFood b on a.id = b.nhahang.id join Food c on b.food.id = c.id join Loaifood d on c.loaifood.id = d.id " +
            "where d.id = :id")
    List<Nhahang> finAllNhaHangByLoaiFood(@Param("id") int id);

    @Query(nativeQuery = true,value = "SELECT a.*   FROM orderfood.nhahang a join orderfood.nhahang_food b on a.id =b.id_nha_hang join orderfood.danhgia c on c.id_nha_hang_food = b.id group by a.id order by avg(c.rate) limit 10 ;")
    List<Nhahang> TopNhaHang();
}
