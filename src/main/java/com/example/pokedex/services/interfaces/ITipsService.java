package com.example.pokedex.services.interfaces;

import com.example.pokedex.controllers.dtos.request.CreateTipsRequest;
import com.example.pokedex.controllers.dtos.request.UpdateTipsRequest;
import com.example.pokedex.controllers.dtos.response.CreateTipsResponse;
import com.example.pokedex.controllers.dtos.response.GetTipsResponse;
import com.example.pokedex.controllers.dtos.response.UpdateTipsResponse;

import java.util.List;

public interface ITipsService {
    GetTipsResponse get(Long id);

    CreateTipsResponse create(CreateTipsRequest request);

    UpdateTipsResponse update(UpdateTipsRequest request, Long id);

    List<GetTipsResponse> list();

    void delete(Long id);
}