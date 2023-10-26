package com.example.primerExamenv1.config;

import com.example.primerExamenv1.dto.EmpresaDto;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@FeignClient(name = "usuario-service",url = "localhost:8083/empresa")
public interface IEmpresaFeing {

    @GetMapping("/buscar/{id}")
    public EmpresaDto buscar(@PathVariable("id") Long id);
}
