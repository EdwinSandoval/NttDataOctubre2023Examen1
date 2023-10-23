package com.example.primerExamenv1.utils;

import lombok.Getter;

@Getter
public enum TipoContrato {

    CONTRATO_INDEFINIDO(1,"Contrato Indefinido"),
    CONTRATO_TEMPORAL(2,"Contrato Temporal"),
    CONTRATO_PRACTICAS(3,"Contrato de Prácticas");

    private final Integer codigo;
    private final String nombre;

    TipoContrato(Integer codigo, String nombre) {
        this.codigo = codigo;
        this.nombre = nombre;
    }
}
