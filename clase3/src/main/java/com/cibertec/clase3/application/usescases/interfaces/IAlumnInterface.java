package com.cibertec.clase3.application.usescases.interfaces;

import com.cibertec.clase3.application.usescases.dto.request.AlumnRequest;
import com.cibertec.clase3.application.usescases.dto.response.AlumnResponse;

import java.util.List;

public interface IAlumnInterface {
    List<AlumnResponse> getAllAlumns();

    AlumnResponse saveAlumn(AlumnRequest alumnRequest);

    AlumnResponse getAlumnById(Long id);
}
