package com.example.pokedex.services.interfaces;

import com.example.pokedex.controllers.dtos.request.CreateForumRequest;
import com.example.pokedex.controllers.dtos.request.UpdateForumRequest;
import com.example.pokedex.controllers.dtos.response.BaseResponse;
import com.example.pokedex.controllers.dtos.response.GetForumResponse;
import com.example.pokedex.controllers.dtos.response.UpdateForumResponse;

import java.util.List;

public interface IForumService {
    GetForumResponse get(Long id);

    BaseResponse create(CreateForumRequest request);

    List<GetForumResponse> list();

    void delete(Long id);

    UpdateForumResponse update(UpdateForumRequest request, Long id);
}
