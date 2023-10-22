package com.example.primerExamenv1.controller;

import com.example.primerExamenv1.dto.request.UsuarioRequestDto;
import com.example.primerExamenv1.dto.response.UsuarioResponseDto;
import com.example.primerExamenv1.service.IUsuarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

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
        return  ResponseEntity.ok(iUsuarioService.listAll());
    }
    @GetMapping("/listar/{id}")
    public ResponseEntity<UsuarioResponseDto> buscarUsuario(@PathVariable(name = "id") Integer idUsuario){
        return new ResponseEntity<>(this.iUsuarioService.getUsuarioById(idUsuario), HttpStatus.OK);
    }

    @PostMapping("/guardar")
    public ResponseEntity<?> save(@RequestBody UsuarioRequestDto request){
        return new ResponseEntity<>(this.iUsuarioService.save(request), HttpStatus.CREATED);
    }

    @DeleteMapping("/eliminar/{id}")
    public String delete(@PathVariable("id") Integer id){
        return iUsuarioService.eliminar(id);
    }

    @PutMapping("/actualizar/{id}")
    public UsuarioResponseDto actualizar(@RequestBody UsuarioRequestDto body, @PathVariable("id") Integer idUsuario) {
        return iUsuarioService.update(body, idUsuario);
    }
}
