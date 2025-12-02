package com.cibertec.clase4.infrastructure.dataproviders.implementation;

import com.cibertec.clase4.application.dtos.ResponseDTO;
import com.cibertec.clase4.infrastructure.dataproviders.interfaces.IRickDataProvider;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

@Component
@RequiredArgsConstructor
public class RickDataProvider implements IRickDataProvider {
    private final RestTemplate restTemplate;
    private String url = "https://rickandmortyapi.com/api/character/";

    public ResponseDTO getPerson(String id) {
        return restTemplate.getForObject(url + id, ResponseDTO.class);
    }
}
