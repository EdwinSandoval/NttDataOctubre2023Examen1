package com.example.primerExamenv1.controller;

import com.example.primerExamenv1.repository.ICuentaBancariaRepository;
import com.example.primerExamenv1.service.IEmpleadoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/cuenta")
public class CuentaBancariaController {
//    @Autowired
//    private ICuentaBancariaRepository iCuentaBancariaRepository;
//
//    @GetMapping("/buscar/numeroCuenta")
//    public ResponseEntity<?> listNameLike(@RequestParam(name = "numeroCuenta") String numeroCuenta){
//        return new ResponseEntity<>(this.iCuentaBancariaRepository.buscarPorNumeroCuenta(numeroCuenta), HttpStatus.OK);
//    }
}
