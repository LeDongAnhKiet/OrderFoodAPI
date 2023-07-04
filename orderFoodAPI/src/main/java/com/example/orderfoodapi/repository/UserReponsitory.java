package com.example.orderfoodapi.repository;

import com.example.orderfoodapi.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserReponsitory extends JpaRepository<User,Integer> {

}
