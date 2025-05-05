package com.example.demo.repositories;

import com.example.demo.entities.Pais;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface PaisRepository extends JpaRepository<Pais, Integer> {
    Optional<Pais> findByNombre(String nombre);
}

