package com.example.primerExamenv1.repository;

import com.example.primerExamenv1.entity.ContratoLaboral;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IContratoRepository  extends JpaRepository<ContratoLaboral, Integer> {
}
