package com.cibertec.clase3.domain.services.interfaces;

import com.cibertec.clase3.application.usescases.dto.request.AlumnRequest;
import com.cibertec.clase3.application.usescases.dto.response.AlumnResponse;

import java.util.List;

public interface IAlumnService {
    List<?> getAllAlumnsServices();
    AlumnResponse saveAlumnServices(AlumnRequest alumnRequest);
}
