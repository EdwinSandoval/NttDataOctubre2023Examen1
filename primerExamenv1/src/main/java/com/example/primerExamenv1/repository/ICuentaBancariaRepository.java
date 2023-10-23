package com.example.primerExamenv1.repository;

import com.example.primerExamenv1.entity.CuentaBancaria;
import com.example.primerExamenv1.entity.Empleado;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface ICuentaBancariaRepository extends JpaRepository<CuentaBancaria, Integer> {
//    @Query(value = "select c from CunetaBancaria c where c.numero_cuenta LIKE ?1")
//    CuentaBancaria buscarPorNumeroCuenta(String nroCuenta);
}
