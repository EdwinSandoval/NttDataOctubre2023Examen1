package com.example.primerExamenv1.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.MappedSuperclass;
import java.io.Serializable;
@MappedSuperclass
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Base  implements Serializable {//esta clase sirve para usarla en cada entity y no estar creando en todas el id
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
}
