package com.example.primerExamenv1.repository;

import com.example.primerExamenv1.entity.CuentaBancaria;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ICuentaBancariaRepository extends JpaRepository<CuentaBancaria, Integer> {
}
