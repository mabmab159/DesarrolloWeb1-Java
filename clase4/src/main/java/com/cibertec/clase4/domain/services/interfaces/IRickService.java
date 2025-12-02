package com.cibertec.clase4.domain.services.interfaces;

import com.cibertec.clase4.application.dtos.ResponseDTO;

public interface IRickService {
    ResponseDTO getPerson(String id);
}
