package com.example.primerExamenv1.service.impl;

import com.example.primerExamenv1.dto.request.UsuarioRequestDto;
import com.example.primerExamenv1.dto.response.CuentaBancariaResponseDto;
import com.example.primerExamenv1.dto.response.EmpleadoResponseDto;
import com.example.primerExamenv1.dto.response.UsuarioResponseDto;
import com.example.primerExamenv1.entity.Base;
import com.example.primerExamenv1.entity.Empleado;
import com.example.primerExamenv1.entity.Usuario;
import com.example.primerExamenv1.repository.BaseRepository;
import com.example.primerExamenv1.repository.IUsuarioRepository;
import com.example.primerExamenv1.service.BaseService;
import com.example.primerExamenv1.service.IUsuarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.io.Serializable;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
@Service
public  class UsuarioServiceImpl extends BaseServiceImpl<Usuario,Integer> implements IUsuarioService {

    @Autowired
    private IUsuarioRepository iUsuarioRepository;
    public UsuarioServiceImpl(BaseRepository<Usuario, Integer> baseRepository) {
        super(baseRepository);
    }


}
