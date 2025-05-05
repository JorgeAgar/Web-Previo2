package com.example.demo.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.entities.Favorito;
import com.example.demo.entities.FavoritoId;
import com.example.demo.entities.Manga;
import com.example.demo.entities.Usuario;

public interface FavoritoRepository extends JpaRepository<Favorito, FavoritoId> {
	void deleteByManga(Manga manga);
	List<Favorito> findByUsuario(Usuario usuario);

}
