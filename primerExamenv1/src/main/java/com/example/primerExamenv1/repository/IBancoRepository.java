package com.example.primerExamenv1.repository;

import com.example.primerExamenv1.entity.Banco;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IBancoRepository  extends JpaRepository<Banco, Integer> {
}
