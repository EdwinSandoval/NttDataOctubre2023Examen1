package com.example.primerExamenv1.service.impl;

import com.example.primerExamenv1.config.IEmpresaFeing;
import com.example.primerExamenv1.dto.EmpresaDto;
import com.example.primerExamenv1.dto.request.EmpleadoRequestDto;
import com.example.primerExamenv1.dto.response.EmpleadoResponseDto;
import com.example.primerExamenv1.dto.response.UsuarioResponseDto;
import com.example.primerExamenv1.entity.ContratoLaboral;
import com.example.primerExamenv1.entity.CuentaBancaria;
import com.example.primerExamenv1.entity.Empleado;
import com.example.primerExamenv1.entity.Usuario;
import com.example.primerExamenv1.repository.IEmpleadoRepository;
import com.example.primerExamenv1.service.IEmpleadoService;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;

@Service
@RequiredArgsConstructor
public class EmpleadoServiceImpl implements IEmpleadoService {
    private final IEmpresaFeing iEmpresaFeing;

    @Autowired()
    private IEmpleadoRepository iEmpleadoRepository;
    @Override
    public List<EmpleadoResponseDto> listAll() {
        return null;
    }

    @Override
    public EmpleadoResponseDto save(EmpleadoRequestDto request) {
        EmpresaDto empresaDto;
        empresaDto=iEmpresaFeing.buscar(request.getEmpresaId());
        if (Objects.nonNull(empresaDto.getMensaje())){
            throw new RuntimeException("No existe la empresa");
        }else{
            Empleado empleado = new Empleado();
            empleado.setNombres(request.getNombres());
            empleado.setApellidos(request.getApellidos());
            empleado.setCuentaBancaria(new CuentaBancaria(request.getIdCuentaBancaria()));
            empleado.setContratoLaboral(new ContratoLaboral(request.getIdContratoLaboral()));
            empleado.setEmpresaId(request.getEmpresaId());
            this.iEmpleadoRepository.save(empleado);

            EmpleadoResponseDto response = new EmpleadoResponseDto();
            response.setNombres(request.getNombres());
            response.setApellidos(request.getApellidos());
            response.setIdCuentaBancaria(request.getIdCuentaBancaria());
            response.setIdContratoLaboral(request.getIdContratoLaboral());
            response.setEmpresaId(request.getEmpresaId());
            return response;
        }


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
//                    empleadoResponseDto.setId(p.getId());
                    empleadoResponseDto.setNombres(p.getNombres());
                    empleadoResponseDto.setApellidos(p.getApellidos());
                    empleadoResponseDto.setIdCuentaBancaria(p.getCuentaBancaria().getId());
                    empleadoResponseDto.setIdContratoLaboral(p.getContratoLaboral().getId());


                    return empleadoResponseDto;
                }).collect(Collectors.toList());
    }
}
