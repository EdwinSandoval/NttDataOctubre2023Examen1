package com.example.primerExamenv1.service.impl;

import com.example.primerExamenv1.dto.request.BancoRequestDto;
import com.example.primerExamenv1.dto.response.BancoResponseDto;
import com.example.primerExamenv1.service.IBancoService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BancoServiceImpl implements IBancoService {
    @Override
    public List<BancoResponseDto> listAll() {
        return null;
    }

    @Override
    public BancoResponseDto save(BancoRequestDto request) {
        return null;
    }

    @Override
    public BancoResponseDto update(BancoRequestDto request, Integer id) {
        return null;
    }

    @Override
    public String eliminar(Integer id) {
        return null;
    }
}
