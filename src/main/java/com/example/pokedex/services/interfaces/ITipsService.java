package com.example.pokedex.services.interfaces;

import com.example.pokedex.controllers.dtos.request.CreateTipsRequest;
import com.example.pokedex.controllers.dtos.request.UpdateTipsRequest;
import com.example.pokedex.controllers.dtos.response.BaseResponse;
import com.example.pokedex.controllers.dtos.response.GetTipsResponse;
import com.example.pokedex.controllers.dtos.response.TipsResponse;
import com.example.pokedex.controllers.dtos.response.UpdateTipsResponse;
import com.example.pokedex.entities.Tips;

import java.util.List;

public interface ITipsService {
    GetTipsResponse get(Long id);

    BaseResponse create(CreateTipsRequest request);

    UpdateTipsResponse update(UpdateTipsRequest request, Long id);

    List<GetTipsResponse> list();

    void delete(Long id);

    List<TipsResponse> listAllTipsByTrainersId(Long trainersId);

    Tips FindOneAndEnsurePicture(Long id);

    Tips save(Tips tips);
}
