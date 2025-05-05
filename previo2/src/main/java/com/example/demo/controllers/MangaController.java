package com.example.demo.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entities.Manga;
import com.example.demo.services.MangaService;

@RestController
@RequestMapping("/mangas")
public class MangaController {

	@Autowired
	private MangaService mServ;
	
	@GetMapping("/listar")
	public List<Manga> listarMangas() {
		return mServ.listMangas();
	}
}
