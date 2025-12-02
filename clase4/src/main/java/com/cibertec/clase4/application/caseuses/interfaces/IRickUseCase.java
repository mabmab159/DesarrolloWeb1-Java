package com.cibertec.clase4.application.caseuses.interfaces;

import com.cibertec.clase4.application.dtos.ResponseDTO;

public interface IRickUseCase {
    ResponseDTO getPerson(String id);
}
