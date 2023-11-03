package com.example.primerExamenv1.dto.response;

import com.example.primerExamenv1.entity.ContratoLaboral;
import com.example.primerExamenv1.entity.CuentaBancaria;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
@Data
@AllArgsConstructor
@NoArgsConstructor
public class EmpleadoResponseDto {
//    private Integer id;
    private String nombres;
    private String apellidos;
    private Integer idCuentaBancaria;
    private Integer idContratoLaboral;
    private Long empresaId;

    private String mensaje;

    public EmpleadoResponseDto(String mensaje) {
        this.mensaje = mensaje;
    }
}
