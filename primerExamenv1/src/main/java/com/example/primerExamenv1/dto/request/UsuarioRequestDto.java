package com.example.primerExamenv1.dto.request;

import com.example.primerExamenv1.dto.response.EmpleadoResponseDto;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class UsuarioRequestDto {
    private String username;
    private String password;
    private Boolean active;
    private Integer idEmpleado;
}
