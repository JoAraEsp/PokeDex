package com.example.pokedex.services.interfaces;

import org.springframework.web.multipart.MultipartFile;

public interface IFileUpdatePokemonService {
    String upload(MultipartFile file, Long idPokemon);
}
