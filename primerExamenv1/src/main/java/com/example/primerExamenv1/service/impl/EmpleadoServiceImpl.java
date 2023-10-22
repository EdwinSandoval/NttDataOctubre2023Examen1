package com.example.primerExamenv1.service.impl;

import com.example.primerExamenv1.dto.request.EmpleadoRequestDto;
import com.example.primerExamenv1.dto.response.EmpleadoResponseDto;
import com.example.primerExamenv1.service.IEmpleadoService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmpleadoServiceImpl implements IEmpleadoService {
    @Override
    public List<EmpleadoResponseDto> listAll() {
        return null;
    }

    @Override
    public EmpleadoResponseDto save(EmpleadoRequestDto request) {
        return null;
    }

    @Override
    public EmpleadoResponseDto update(EmpleadoRequestDto request, Integer id) {
        return null;
    }

    @Override
    public String eliminar(Integer id) {
        return null;
    }
}
