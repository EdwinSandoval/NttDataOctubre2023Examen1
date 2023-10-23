package com.example.primerExamenv1.controller;

import com.example.primerExamenv1.entity.Usuario;
import com.example.primerExamenv1.service.impl.UsuarioServiceImpl;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin(origins = "*")//permitir acceder a la api
@RequestMapping("/usuario")
public class UsuarioController extends BaseControllerImpl<Usuario, UsuarioServiceImpl> {
}
