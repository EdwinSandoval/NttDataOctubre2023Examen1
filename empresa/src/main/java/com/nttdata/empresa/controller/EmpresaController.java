package com.nttdata.empresa.controller;

import com.nttdata.empresa.dto.EmpresaDto;
import com.nttdata.empresa.service.IEmpresaService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.HttpHeaders;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/empresa")
public class EmpresaController {

//  @Value("${mensaje}")
//  private String mensaje;

  @Autowired
  private IEmpresaService iEmpresaService;

  @GetMapping(value = "/saludo")
  public String saludo() {
    return "hola mundo";
  }

  @GetMapping(value = "/listar")
  public List<EmpresaDto> listar() {
    return iEmpresaService.listar();
  }

  @GetMapping(value = "/buscar/{id}")
  public EmpresaDto buscar(@PathVariable Long id, @RequestHeader HttpHeaders headers) {
    System.out.println(headers);
//    System.out.println(mensaje);
    return iEmpresaService.buscar(id);
  }

  @PostMapping(value = "/registrar")
  public EmpresaDto registrar(@RequestBody EmpresaDto empresaDto) {
    return iEmpresaService.registrar(empresaDto);
  }

  @PutMapping(value = "/actualizar/{id}")
  public EmpresaDto actualizar(@PathVariable Long id, @RequestBody EmpresaDto empresaDto) {
    return iEmpresaService.actualizar(id, empresaDto);
  }

  @DeleteMapping(value = "/eliminar/{id}")
  public String eliminar(@PathVariable Long id) {
    return iEmpresaService.eliminar(id);
  }
}
