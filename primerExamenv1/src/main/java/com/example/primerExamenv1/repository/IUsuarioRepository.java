package com.example.primerExamenv1.repository;

import com.example.primerExamenv1.entity.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IUsuarioRepository extends JpaRepository<Usuario, Integer> {
}
