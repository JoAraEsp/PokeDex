package com.example.pokedex.services.interfaces;

import com.example.pokedex.controllers.dtos.response.BaseResponse;

public interface ITrainersForumService {

    BaseResponse listAllTrainersByForumId(Long forumId);
}
