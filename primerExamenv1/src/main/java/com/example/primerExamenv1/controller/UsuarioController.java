package com.example.primerExamenv1.controller;

import com.example.primerExamenv1.dto.response.UsuarioResponseDto;
import com.example.primerExamenv1.service.IUsuarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/usuario")
public class UsuarioController {

//    @GetMapping("/listar")
//    public String saludo(){
//        return "hola como estas";
//    }
    @Autowired
    private IUsuarioService iUsuarioService;

    @GetMapping("/listar")
    public ResponseEntity<List<UsuarioResponseDto>> listAll(){
        return new ResponseEntity<>(this.iUsuarioService.listAll(), HttpStatus.OK);
    }
}
