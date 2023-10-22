package com.example.primerExamenv1.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Table(name = "cuenta_bancaria")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class CuentaBancaria {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    @Column(name = "numero_cuenta")
    private String numeroCuenta;

    @ManyToOne
    @JoinColumn(name = "idBanco")
    private Banco idBanco;

//    @OneToOne(mappedBy = "cuentaBancaria")
//    private Empleado empleado;
}
