package com.example.demo.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.dtos.FavoritoDTO;
import com.example.demo.repositories.FavoritoRepository;
import com.example.demo.services.FavoritoService;

@RestController
@RequestMapping("/usuarios")
public class UsuarioController {

	@Autowired
	private FavoritoService favoritoService;
	
	@GetMapping("/{username}/favoritos")
	public List<FavoritoDTO> getUserFavoritos(@PathVariable String username) {
		return favoritoService.getFavoritosByUsername(username);
	}
	
	@DeleteMapping("/{username}/favoritos/{mangaId}")
	public void deleteFavoritoByUsernameAndMangaId(String username, Integer mangaId) {
		favoritoService.deleteFavoritoByUsernameAndMangaId(username, mangaId);
	}
}
