package com.example.primerExamenv1.dto.response;

import com.example.primerExamenv1.entity.Empleado;
import lombok.*;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class UsuarioResponseDto {
    private Integer id;
    private String username;
    private String password;
    private Boolean active;
    private Integer idEmpleado;
//    private EmpleadoResponseDto empleado;


}
