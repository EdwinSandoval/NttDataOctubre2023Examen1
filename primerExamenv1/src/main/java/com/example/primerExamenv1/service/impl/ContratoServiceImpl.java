package com.example.primerExamenv1.service.impl;

import com.example.primerExamenv1.dto.request.ContratoRequestDto;
import com.example.primerExamenv1.dto.response.ContratoResponseDto;
import com.example.primerExamenv1.service.IContratoService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ContratoServiceImpl implements IContratoService {
    @Override
    public List<ContratoResponseDto> listAll() {
        return null;
    }

    @Override
    public ContratoResponseDto save(ContratoRequestDto request) {
        return null;
    }

    @Override
    public ContratoResponseDto update(ContratoRequestDto request, Integer id) {
        return null;
    }

    @Override
    public String eliminar(Integer id) {
        return null;
    }
}
