package com.example.demo.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.entities.Favorito;
import com.example.demo.entities.FavoritoId;

public interface FavoritoRepository extends JpaRepository<Favorito, FavoritoId> {

}
