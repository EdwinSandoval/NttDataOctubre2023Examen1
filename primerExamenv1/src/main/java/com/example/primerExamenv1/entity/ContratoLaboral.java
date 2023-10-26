package com.example.primerExamenv1.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "contrato_laboral")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class ContratoLaboral {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    @Column(name = "sueldo_base")
    private Double sueldoBase;
    @Column(name = "tipo_contrato")
    private Integer tipoContrato;

    @OneToMany(mappedBy = "contratoLaboral")
    private List<Empleado> empleados;

    public ContratoLaboral(Integer id) {
        this.id = id;
    }
}
