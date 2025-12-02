package com.cibertec.clase4.domain.services.implementation;

import com.cibertec.clase4.application.dtos.ResponseDTO;
import com.cibertec.clase4.domain.services.interfaces.IRickService;
import com.cibertec.clase4.infrastructure.dataproviders.interfaces.ApiFeignPerson;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class RickService implements IRickService {
    private final ApiFeignPerson apiFeignPerson;

    @Override
    public ResponseDTO getPerson(String id) {
        System.out.println(apiFeignPerson.getCharacter(id));
        return apiFeignPerson.getCharacter(id);
    }
}
