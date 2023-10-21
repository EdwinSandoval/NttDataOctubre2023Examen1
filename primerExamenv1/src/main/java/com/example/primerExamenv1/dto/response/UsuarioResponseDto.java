package com.example.primerExamenv1.dto.response;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class UsuarioResponseDto {

    private String username;
    private String password;
    private Boolean active;
}
