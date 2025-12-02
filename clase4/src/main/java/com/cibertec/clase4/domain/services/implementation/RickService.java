package com.cibertec.clase4.domain.services.implementation;

import com.cibertec.clase4.application.dtos.ResponseDTO;
import com.cibertec.clase4.domain.services.interfaces.IRickService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class RickService implements IRickService {


    @Override
    public ResponseDTO getPerson(String id) {
        return null;
    }
}
