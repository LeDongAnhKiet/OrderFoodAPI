package com.example.orderfoodapi.repository;

import com.example.orderfoodapi.entity.Uudai;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UuDaiRepository extends JpaRepository<Uudai,Integer> {
    Uudai findUudaiById(int id);
}
