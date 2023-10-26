package com.example.primerExamenv1.controller;

import com.example.primerExamenv1.dto.request.EmpleadoRequestDto;
import com.example.primerExamenv1.dto.request.UsuarioRequestDto;
import com.example.primerExamenv1.service.IEmpleadoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/empleado")
public class EmpleadoController {
    @Autowired
    private IEmpleadoService empleadoService;

    @GetMapping("/listar")
    public ResponseEntity<?> listNameLike(@RequestParam(name = "nombres") String nombre){
        return new ResponseEntity<>(this.empleadoService.listEmpleadoNombre(nombre), HttpStatus.OK);
    }

    @PostMapping("/guardar")
    public ResponseEntity<?> save(@RequestBody EmpleadoRequestDto request){
        return new ResponseEntity<>(this.empleadoService.save(request), HttpStatus.CREATED);
    }
}
