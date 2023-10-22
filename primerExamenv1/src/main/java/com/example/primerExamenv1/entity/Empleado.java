package com.example.primerExamenv1.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
@Entity
@Table(name = "empleado")
@Getter // genera todos los getters
@Setter // genera todos los setters
@AllArgsConstructor
@NoArgsConstructor
public class Empleado {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    private String nombres;
    private String apellidos;

//    @OneToOne(mappedBy = "empleado")
//    private Usuario usuario;
//cascade = CascadeType.ALL
    @OneToOne()
    @JoinColumn(name = "id_cuenta_bancaria")
    private CuentaBancaria cuentaBancaria;
//cascade = CascadeType.PERSIST
    @ManyToOne()
    @JoinColumn(name = "id_contrato_laboral")
    private ContratoLaboral contratoLaboral;

    public Empleado(Integer id) {
        this.id = id;
    }
}
