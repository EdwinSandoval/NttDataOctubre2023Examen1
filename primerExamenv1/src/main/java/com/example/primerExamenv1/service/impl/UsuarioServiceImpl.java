package com.example.primerExamenv1.service.impl;

import com.example.primerExamenv1.dto.request.UsuarioRequestDto;
import com.example.primerExamenv1.dto.response.CuentaBancariaResponseDto;
import com.example.primerExamenv1.dto.response.EmpleadoResponseDto;
import com.example.primerExamenv1.dto.response.UsuarioResponseDto;
import com.example.primerExamenv1.entity.Empleado;
import com.example.primerExamenv1.entity.Usuario;
//import com.example.primerExamenv1.mapper.IUsuarioEntityMapper;
import com.example.primerExamenv1.repository.IUsuarioRepository;
import com.example.primerExamenv1.service.IUsuarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
@Service
public class UsuarioServiceImpl implements IUsuarioService {

    @Autowired()
    private IUsuarioRepository iUsuarioRepository;
//    @Autowired(required = false)
//    private IUsuarioEntityMapper iUsuarioEntityMapper;
    @Override
    public List<UsuarioResponseDto> listAll() {

        return this.iUsuarioRepository.findAll().stream()
                .map(p -> {
                    UsuarioResponseDto usuarioResponseDto = new UsuarioResponseDto();
                    usuarioResponseDto.setId(p.getId());
                    usuarioResponseDto.setUsername(p.getUsername());
                    usuarioResponseDto.setPassword(p.getPassword());
                    usuarioResponseDto.setActive(p.getActive());
                    usuarioResponseDto.setIdEmpleado(p.getEmpleado().getId());

                   return usuarioResponseDto;
                }).collect(Collectors.toList());
    }

    @Override
    public UsuarioResponseDto save(UsuarioRequestDto request) {
        Usuario usuario = new Usuario();

        usuario.setUsername(request.getUsername());
        usuario.setPassword(request.getPassword());
        usuario.setActive(request.getActive());
        usuario.setEmpleado(new Empleado(request.getIdEmpleado()));
        this.iUsuarioRepository.save(usuario);

        UsuarioResponseDto response = new UsuarioResponseDto();
//        response.setId(usuario.getId());
        response.setUsername(usuario.getUsername());
        response.setPassword(usuario.getPassword());
        response.setActive(usuario.getActive());
        response.setIdEmpleado(usuario.getEmpleado().getId());
        return response;
    }

    @Override
    public UsuarioResponseDto update(UsuarioRequestDto request,Integer idUsuario) {
        Optional<Usuario> encontrado = iUsuarioRepository.findById(idUsuario);
        Usuario usuario = new Usuario();
        usuario.setId(idUsuario);
        usuario.setUsername(request.getUsername());
        usuario.setPassword(request.getPassword());
        usuario.setActive(request.getActive());
        usuario.setEmpleado(new Empleado(request.getIdEmpleado()));
        this.iUsuarioRepository.save(usuario);

        UsuarioResponseDto response = new UsuarioResponseDto();
        response.setId(idUsuario);
        response.setUsername(usuario.getUsername());
        response.setPassword(usuario.getPassword());
        response.setActive(usuario.getActive());
        response.setIdEmpleado(usuario.getEmpleado().getId());
        return response;
    }

    @Override
    public String eliminar(Integer id) {
        Optional<Usuario> encontrado = iUsuarioRepository.findById(id);
        if (encontrado.isPresent()) {
            iUsuarioRepository.deleteById(id);
            return "Usuario eliminado correctamente";
        }
        return "Usuario no se encuentra registrado";
    }
    @Override
    public UsuarioResponseDto getUsuarioById(Integer id) {
        UsuarioResponseDto usuarioResponseDto=new UsuarioResponseDto();
        Optional<Usuario> usuario=iUsuarioRepository.findById(id);
        if(usuario.isPresent()){
            usuarioResponseDto.setId(usuario.get().getId());
            usuarioResponseDto.setUsername(usuario.get().getUsername());
            usuarioResponseDto.setPassword(usuario.get().getPassword());
            usuarioResponseDto.setActive(usuario.get().getActive());
            usuarioResponseDto.setIdEmpleado(usuario.get().getEmpleado().getId());

        }

        return usuarioResponseDto;
    }




}
