package com.cibertec.clase3.application.usescases.implementation;

import com.cibertec.clase3.application.usescases.dto.request.AlumnRequest;
import com.cibertec.clase3.application.usescases.dto.response.AlumnResponse;
import com.cibertec.clase3.application.usescases.interfaces.IAlumnInterface;
import com.cibertec.clase3.domain.services.interfaces.IAlumnService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
@RequiredArgsConstructor
public class AlumnImplementation implements IAlumnInterface {
    private final IAlumnService iAlumnService;

    @Override
    public List<AlumnResponse> getAllAlumns() {
        return iAlumnService.getAllAlumnsServices();
    }

    @Override
    public AlumnResponse saveAlumn(AlumnRequest alumnRequest) {
        return iAlumnService.saveAlumnServices(alumnRequest);
    }

    @Override
    public AlumnResponse getAlumnById(Long id) {
        return iAlumnService.getAlumnByIdServices(id);
    }
}
