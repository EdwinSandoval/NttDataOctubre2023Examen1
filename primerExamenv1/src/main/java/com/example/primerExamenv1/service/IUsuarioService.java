package com.example.primerExamenv1.service;

import com.example.primerExamenv1.dto.request.UsuarioRequestDto;
import com.example.primerExamenv1.dto.response.UsuarioResponseDto;
import com.example.primerExamenv1.entity.Usuario;

import java.util.List;

public interface IUsuarioService {
    List<UsuarioResponseDto> listAll();

    UsuarioResponseDto save(UsuarioRequestDto request);

    UsuarioResponseDto update(UsuarioRequestDto request);

    void delete(Integer id);

    UsuarioResponseDto getProductoById (Integer id);

    List<Usuario> listAllProducto(String nombre);
}
