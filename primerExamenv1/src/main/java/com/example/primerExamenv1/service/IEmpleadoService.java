package com.example.primerExamenv1.service;



import com.example.primerExamenv1.dto.request.EmpleadoRequestDto;
import com.example.primerExamenv1.dto.response.EmpleadoResponseDto;

import java.util.List;

public interface IEmpleadoService {
    List<EmpleadoResponseDto> listAll();

    EmpleadoResponseDto save(EmpleadoRequestDto request);

    EmpleadoResponseDto update(EmpleadoRequestDto request,Integer id);

    String eliminar(Integer id);

    List<EmpleadoResponseDto> listEmpleadoNombre(String nombre);
}
