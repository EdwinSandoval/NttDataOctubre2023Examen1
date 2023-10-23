package com.example.primerExamenv1.service.impl;

import com.example.primerExamenv1.dto.request.EmpleadoRequestDto;
import com.example.primerExamenv1.dto.response.EmpleadoResponseDto;
import com.example.primerExamenv1.entity.Empleado;
import com.example.primerExamenv1.entity.Usuario;
import com.example.primerExamenv1.repository.BaseRepository;
import com.example.primerExamenv1.repository.IEmpleadoRepository;
import com.example.primerExamenv1.repository.IUsuarioRepository;
import com.example.primerExamenv1.service.IEmpleadoService;
import com.example.primerExamenv1.service.IUsuarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmpleadoServiceImpl  extends BaseServiceImpl<Empleado,Integer> implements IEmpleadoService {

    @Autowired
    private IEmpleadoRepository iEmpleadoRepository;
    public EmpleadoServiceImpl(BaseRepository<Empleado, Integer> baseRepository) {
        super(baseRepository);
    }

}
