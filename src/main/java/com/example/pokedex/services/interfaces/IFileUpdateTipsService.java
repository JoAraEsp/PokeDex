package com.example.pokedex.services.interfaces;

import org.springframework.web.multipart.MultipartFile;

public interface IFileUpdateTipsService {
    String upload(MultipartFile file, Long idTips);
}
