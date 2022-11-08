package com.example.pokedex.services.interfaces;

import com.example.pokedex.controllers.dtos.response.BaseResponse;

public interface IPokemonSkillService {
    BaseResponse listAllSkillsByPokemonId(Long pokemonId);
    BaseResponse listAllPokemonBySkillsId(Long skillId);
}
