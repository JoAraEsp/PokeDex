package com.example.pokedex.services.interfaces;

import com.example.pokedex.controllers.dtos.response.BaseResponse;

public interface ITrainersLeagueService {
    BaseResponse listAllTrainersByLeagueId(Long leagueId);

    BaseResponse listAllLeaguesByTrainersId(Long trainerId);
}
