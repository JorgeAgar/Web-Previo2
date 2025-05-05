package com.example.demo.services;

import com.example.demo.dtos.FavoritoDTO;
import com.example.demo.entities.Favorito;
import com.example.demo.entities.Usuario;
import com.example.demo.repositories.FavoritoRepository;
import com.example.demo.repositories.UsuarioRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
@RequiredArgsConstructor
public class FavoritoService {

    private final FavoritoRepository favoritoRepository;
    private final UsuarioRepository usuarioRepository;

    public List<FavoritoDTO> getFavoritosByUsername(String username) {
        Usuario usuario = usuarioRepository.findByUsername(username);

        List<Favorito> favoritos = favoritoRepository.findByUsuario(usuario);

        return favoritos.stream()
                .map(FavoritoDTO::new)
                .collect(Collectors.toList());
    }
}
