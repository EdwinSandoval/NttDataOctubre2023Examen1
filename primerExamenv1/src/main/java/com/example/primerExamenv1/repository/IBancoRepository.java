package com.example.primerExamenv1.repository;

import com.example.primerExamenv1.entity.Banco;
import com.example.primerExamenv1.entity.Empleado;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface IBancoRepository  extends JpaRepository<Banco, Integer> {
    @Query(value = "select  * from banco where nombre LIKE ?1", nativeQuery = true)
    List<Banco> findByNombresLike(String nombre);
}
