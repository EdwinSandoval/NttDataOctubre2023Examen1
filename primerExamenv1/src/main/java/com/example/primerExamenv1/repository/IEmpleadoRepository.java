package com.example.primerExamenv1.repository;

import com.example.primerExamenv1.entity.Empleado;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface IEmpleadoRepository extends JpaRepository<Empleado, Integer> {
//    @Query(value = "select  * from empleado where nombres LIKE ?1", nativeQuery = true)
    List<Empleado> findByNombresLike(String nombre);
}
