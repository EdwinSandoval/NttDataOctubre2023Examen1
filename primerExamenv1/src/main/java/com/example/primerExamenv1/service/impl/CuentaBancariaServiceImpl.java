package com.example.primerExamenv1.service.impl;

import com.example.primerExamenv1.dto.request.CuentaBancariaRequestDto;
import com.example.primerExamenv1.dto.response.CuentaBancariaResponseDto;
import com.example.primerExamenv1.dto.response.UsuarioResponseDto;
import com.example.primerExamenv1.entity.CuentaBancaria;
import com.example.primerExamenv1.entity.Usuario;
import com.example.primerExamenv1.repository.ICuentaBancariaRepository;
import com.example.primerExamenv1.repository.IEmpleadoRepository;
import com.example.primerExamenv1.service.ICuentaBancariaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Service
public class CuentaBancariaServiceImpl implements ICuentaBancariaService {
//    @Autowired()
//    private ICuentaBancariaRepository iCuentaBancariaRepository;
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

    @Override
    public CuentaBancariaResponseDto buscarPorNumeroCuenta(String nroCuenta) {

//        CuentaBancariaResponseDto cuentaBancariaResponseDto = new CuentaBancariaResponseDto();
//        CuentaBancaria cuenta=iCuentaBancariaRepository.buscarPorNumeroCuenta(nroCuenta);
//
//            cuentaBancariaResponseDto.setId(cuenta.getId());
//            cuentaBancariaResponseDto.setNumeroCuenta(cuenta.getNumeroCuenta());
//            cuentaBancariaResponseDto.setIdBanco(cuenta.getIdBanco().getIdBanco());
//
//        return cuentaBancariaResponseDto;
        return null;

    }
}
