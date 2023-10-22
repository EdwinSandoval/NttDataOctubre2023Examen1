package com.example.primerExamenv1.repository;

import com.example.primerExamenv1.entity.Empleado;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IEmpleadoRepository extends JpaRepository<Empleado, Integer> {
}
