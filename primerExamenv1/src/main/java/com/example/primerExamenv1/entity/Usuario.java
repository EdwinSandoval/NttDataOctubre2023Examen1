package com.example.primerExamenv1.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.util.List;
@Entity
@Table(name = "usuario")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Usuario extends Base{
//    @Id
//    @GeneratedValue(strategy = GenerationType.IDENTITY)
//    private Integer id;
    private String username;
    private String password;
    private Boolean active;

    @ManyToMany(mappedBy = "usuarios")
    private List<Rol> rol;
//cascade = CascadeType.ALL
    @OneToOne()
    @JoinColumn(name = "id_empleado")
    private Empleado empleado;


}
