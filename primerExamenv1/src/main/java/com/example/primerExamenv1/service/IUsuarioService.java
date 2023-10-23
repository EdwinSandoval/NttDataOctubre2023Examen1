package com.example.primerExamenv1.service;

import com.example.primerExamenv1.dto.request.UsuarioRequestDto;
import com.example.primerExamenv1.dto.response.UsuarioResponseDto;
import com.example.primerExamenv1.entity.Usuario;

import java.util.List;

public interface IUsuarioService {
    List<UsuarioResponseDto> listAll();

    UsuarioResponseDto save(UsuarioRequestDto request);

    UsuarioResponseDto update(UsuarioRequestDto request,Integer id);

    String eliminar(Integer id);

    UsuarioResponseDto getUsuarioById (Integer id);
    List<UsuarioResponseDto> listarUsuarioActivo(Boolean active);

}
