package com.example.primerExamenv1.dto.request;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class EmpleadoRequestDto {
//    private Integer id;
    private String nombres;
    private String apellidos;
    private Integer idCuentaBancaria;
    private Integer idContratoLaboral;
    private Long empresaId;
}
