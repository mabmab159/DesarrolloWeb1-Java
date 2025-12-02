package com.cibertec.clase4.infrastructure.dataproviders.interfaces;

import com.cibertec.clase4.application.dtos.ResponseDTO;

public interface IRickDataProvider {
    ResponseDTO getPerson(String id);
}
