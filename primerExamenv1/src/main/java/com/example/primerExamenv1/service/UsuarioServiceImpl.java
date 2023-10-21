package com.example.primerExamenv1.service;

import com.example.primerExamenv1.dto.request.UsuarioRequestDto;
import com.example.primerExamenv1.dto.response.UsuarioResponseDto;
import com.example.primerExamenv1.entity.Usuario;
import com.example.primerExamenv1.repository.IUsuarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;
@Service
public class UsuarioServiceImpl implements IUsuarioService{

    @Autowired
    private IUsuarioRepository iUsuarioRepository;
    @Override
    public List<UsuarioResponseDto> listAll() {
        return this.iUsuarioRepository.findAll().stream()
                .map(p -> {
                    UsuarioResponseDto usuarioResponseDto = new UsuarioResponseDto();
                    usuarioResponseDto.setUsername(p.getUsername());
                    usuarioResponseDto.setPassword(p.getPassword());
                    usuarioResponseDto.setActive(p.getActive());
                    return usuarioResponseDto;
                }).collect(Collectors.toList());
    }

    @Override
    public UsuarioResponseDto save(UsuarioRequestDto request) {
        return null;
    }

    @Override
    public UsuarioResponseDto update(UsuarioRequestDto request) {
        return null;
    }

    @Override
    public void delete(Integer id) {

    }

    @Override
    public UsuarioResponseDto getProductoById(Integer id) {
        return null;
    }

    @Override
    public List<Usuario> listAllProducto(String nombre) {
        return null;
    }
}
