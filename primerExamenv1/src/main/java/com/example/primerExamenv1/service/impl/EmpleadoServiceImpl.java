package com.example.primerExamenv1.service.impl;

import com.example.primerExamenv1.dto.request.EmpleadoRequestDto;
import com.example.primerExamenv1.dto.response.EmpleadoResponseDto;
import com.example.primerExamenv1.repository.IEmpleadoRepository;
import com.example.primerExamenv1.service.IEmpleadoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class EmpleadoServiceImpl implements IEmpleadoService {

    @Autowired()
    private IEmpleadoRepository iEmpleadoRepository;
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

    @Override
    public List<EmpleadoResponseDto> listEmpleadoNombre(String nombre) {
        return this.iEmpleadoRepository.findByNombresLike(nombre).stream()
                .map(p -> {
                    EmpleadoResponseDto empleadoResponseDto = new EmpleadoResponseDto();
                    empleadoResponseDto.setId(p.getId());
                    empleadoResponseDto.setNombres(p.getNombres());
                    empleadoResponseDto.setApellidos(p.getApellidos());
                    empleadoResponseDto.setIdCuentaBancaria(p.getCuentaBancaria().getId());
                    empleadoResponseDto.setIdContratoLaboral(p.getContratoLaboral().getId());


                    return empleadoResponseDto;
                }).collect(Collectors.toList());
    }
}
