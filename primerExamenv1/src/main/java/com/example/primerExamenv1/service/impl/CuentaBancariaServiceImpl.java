package com.example.primerExamenv1.service.impl;

import com.example.primerExamenv1.dto.request.CuentaBancariaRequestDto;
import com.example.primerExamenv1.dto.response.CuentaBancariaResponseDto;
import com.example.primerExamenv1.service.ICuentaBancariaService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CuentaBancariaServiceImpl implements ICuentaBancariaService {
    @Override
    public List<CuentaBancariaResponseDto> listAll() {
        return null;
    }

    @Override
    public CuentaBancariaResponseDto save(CuentaBancariaRequestDto request) {
        return null;
    }

    @Override
    public CuentaBancariaResponseDto update(CuentaBancariaRequestDto request, Integer id) {
        return null;
    }

    @Override
    public String eliminar(Integer id) {
        return null;
    }
}
