package com.example.primerExamenv1.repository;

import com.example.primerExamenv1.entity.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface IUsuarioRepository extends JpaRepository<Usuario, Integer> {

    @Query(value = "select  * from usuario where active = ?1", nativeQuery = true)
    List<Usuario> listUsuarioActive(Boolean active);
}
