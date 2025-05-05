package com.example.demo.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entities.Manga;
import com.example.demo.repositories.MangaRepository;

@Service
public class MangaService {
	@Autowired
	private MangaRepository mRepo;
	
	public List<Manga> listMangas() {
		return mRepo.findAll();
	}

	public Manga getMangaById(int id) {
		return mRepo.getReferenceById(id);
	}
}
