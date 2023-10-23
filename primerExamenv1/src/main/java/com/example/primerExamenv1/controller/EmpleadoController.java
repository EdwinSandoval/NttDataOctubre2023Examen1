package com.example.primerExamenv1.controller;

import com.example.primerExamenv1.service.IEmpleadoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/empleado")
public class EmpleadoController {
    @Autowired
    private IEmpleadoService empleadoService;

    @GetMapping("/listar")
    public ResponseEntity<?> listNameLike(@RequestParam(name = "nombres") String nombre){
        return new ResponseEntity<>(this.empleadoService.listEmpleadoNombre(nombre), HttpStatus.OK);
    }
}
