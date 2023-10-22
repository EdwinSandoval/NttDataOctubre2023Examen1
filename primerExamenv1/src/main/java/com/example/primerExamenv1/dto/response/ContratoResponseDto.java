package com.example.primerExamenv1.dto.response;

import com.example.primerExamenv1.entity.Empleado;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Column;
import javax.persistence.OneToMany;
import java.util.List;
@Data
@AllArgsConstructor
@NoArgsConstructor
public class ContratoResponseDto {
    private Integer id;
    private Double sueldoBase;
    private Integer tipoContrato;
    private List<EmpleadoResponseDto> empleados;
}
