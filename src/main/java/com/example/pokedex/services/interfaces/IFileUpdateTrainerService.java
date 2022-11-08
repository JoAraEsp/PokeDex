package com.example.pokedex.services.interfaces;

import org.springframework.web.multipart.MultipartFile;

public interface IFileUpdateTrainerService {

    String upload(MultipartFile multipartFile,Long idTrainer);
}
