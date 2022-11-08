package com.example.pokedex.services.interfaces;

import com.example.pokedex.controllers.dtos.request.CreatePokemonRequest;
import com.example.pokedex.controllers.dtos.request.UpdatePokemonRequest;
import com.example.pokedex.controllers.dtos.response.BaseResponse;
import com.example.pokedex.controllers.dtos.response.GetPokemonResponse;
import com.example.pokedex.controllers.dtos.response.UpdatePokemonResponse;
import com.example.pokedex.entities.Pokemon;

import java.util.List;

public interface IPokemonService {
    GetPokemonResponse get(Long id);

    BaseResponse create(CreatePokemonRequest request);

    UpdatePokemonResponse update(UpdatePokemonRequest request, Long id);

    List<GetPokemonResponse> list();

    void delete(Long id);

    Pokemon FindOneAndEnsurePicture(Long id);

    Pokemon save(Pokemon pokemon);
}
