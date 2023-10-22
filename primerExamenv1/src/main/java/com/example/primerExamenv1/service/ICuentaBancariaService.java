package com.example.primerExamenv1.service;



import com.example.primerExamenv1.dto.request.CuentaBancariaRequestDto;
import com.example.primerExamenv1.dto.response.CuentaBancariaResponseDto;

import java.util.List;

public interface ICuentaBancariaService {
    List<CuentaBancariaResponseDto> listAll();

    CuentaBancariaResponseDto save(CuentaBancariaRequestDto request);

    CuentaBancariaResponseDto update(CuentaBancariaRequestDto request,Integer id);

    String eliminar(Integer id);

//    CuentaBancariaResponseDto getUsuarioById (Integer id);
}
