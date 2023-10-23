package com.example.primerExamenv1.repository;

import com.example.primerExamenv1.entity.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IUsuarioRepository extends BaseRepository<Usuario, Integer> {
}
