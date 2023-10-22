package com.example.primerExamenv1.service;



import com.example.primerExamenv1.dto.request.ContratoRequestDto;
import com.example.primerExamenv1.dto.response.ContratoResponseDto;

import java.util.List;

public interface IContratoService {
    List<ContratoResponseDto> listAll();

    ContratoResponseDto save(ContratoRequestDto request);

    ContratoResponseDto update(ContratoRequestDto request,Integer id);

    String eliminar(Integer id);

}
