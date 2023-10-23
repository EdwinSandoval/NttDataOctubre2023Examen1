package com.example.primerExamenv1.dto.response;

import com.example.primerExamenv1.entity.Banco;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class CuentaBancariaResponseDto {
    private Integer id;
    private String numeroCuenta;
    private Integer idBanco;

    public CuentaBancariaResponseDto(Integer idBanco) {
        this.idBanco = idBanco;
    }
}
