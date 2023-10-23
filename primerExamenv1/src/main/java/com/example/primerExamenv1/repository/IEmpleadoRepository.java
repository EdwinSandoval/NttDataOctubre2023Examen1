package com.example.primerExamenv1.repository;

import com.example.primerExamenv1.entity.Empleado;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IEmpleadoRepository extends BaseRepository <Empleado, Integer> {
}
