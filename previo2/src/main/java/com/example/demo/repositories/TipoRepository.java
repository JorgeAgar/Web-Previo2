package com.example.demo.repositories;

import com.example.demo.entities.Tipo;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface TipoRepository extends JpaRepository<Tipo, Integer> {
    Optional<Tipo> findByNombre(String nombre);
}
