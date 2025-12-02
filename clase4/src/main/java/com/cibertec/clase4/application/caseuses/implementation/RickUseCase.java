package com.cibertec.clase4.application.caseuses.implementation;

import com.cibertec.clase4.application.caseuses.interfaces.IRickUseCase;
import com.cibertec.clase4.application.dtos.ResponseDTO;
import com.cibertec.clase4.domain.services.interfaces.IRickService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
public class RickUseCase implements IRickUseCase {
    private final IRickService iRickService;

    @Override
    public ResponseDTO getPerson(String id) {
        return iRickService.getPerson(id);
    }
}
