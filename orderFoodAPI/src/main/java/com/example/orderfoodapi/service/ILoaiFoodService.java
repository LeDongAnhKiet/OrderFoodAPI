package com.example.orderfoodapi.service;

import com.example.orderfoodapi.dto.LoaifoodDTO;

public interface ILoaiFoodService {
    LoaifoodDTO save(LoaifoodDTO loaifoodDTO);
    void delete(int[] id);
}
