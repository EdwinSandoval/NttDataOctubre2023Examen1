package com.example.primerExamenv1.service.impl;

import com.example.primerExamenv1.dto.request.BancoRequestDto;
import com.example.primerExamenv1.dto.response.BancoResponseDto;
import com.example.primerExamenv1.dto.response.EmpleadoResponseDto;
import com.example.primerExamenv1.repository.IBancoRepository;
import com.example.primerExamenv1.repository.IEmpleadoRepository;
import com.example.primerExamenv1.service.IBancoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class BancoServiceImpl implements IBancoService {
    @Autowired()
    private IBancoRepository iBancoRepository;
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

    @Override
    public List<BancoResponseDto> listBancoNombre(String nombre) {
        return this.iBancoRepository.findByNombresLike(nombre).stream()
                .map(p -> {
                    BancoResponseDto empleadoResponseDto = new BancoResponseDto();
                    empleadoResponseDto.setId(p.getIdBanco());
                    empleadoResponseDto.setNombre(p.getNombre());



                    return empleadoResponseDto;
                }).collect(Collectors.toList());
    }
}
