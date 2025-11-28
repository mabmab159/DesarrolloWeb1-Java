package com.cibertec.clase3.domain.services.implementation;

import com.cibertec.clase3.application.usescases.dto.request.AlumnRequest;
import com.cibertec.clase3.application.usescases.dto.response.AlumnResponse;
import com.cibertec.clase3.domain.services.interfaces.IAlumnService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AlumnServiceImplementation implements IAlumnService {
    public List<?> getAllAlumnsServices() {
        return List.of();
    }

    @Override
    public AlumnResponse saveAlumnServices(AlumnRequest alumnRequest) {
        return AlumnResponse.builder()
                .name("Miguel")
                .id(2L)
                .address("Villa chica 22")
                .build();
    }
}
