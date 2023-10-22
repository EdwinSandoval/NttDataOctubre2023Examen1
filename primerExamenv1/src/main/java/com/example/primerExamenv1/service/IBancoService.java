package com.example.primerExamenv1.service;



import com.example.primerExamenv1.dto.request.BancoRequestDto;
import com.example.primerExamenv1.dto.response.BancoResponseDto;

import java.util.List;

public interface IBancoService {
    List<BancoResponseDto> listAll();

    BancoResponseDto save(BancoRequestDto request);

    BancoResponseDto update(BancoRequestDto request,Integer id);

    String eliminar(Integer id);
}
