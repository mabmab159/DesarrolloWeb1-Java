package com.cibertec.clase3.domain.services.implementation;

import com.cibertec.clase3.application.usescases.dto.request.AlumnRequest;
import com.cibertec.clase3.application.usescases.dto.response.AlumnResponse;
import com.cibertec.clase3.domain.services.interfaces.IAlumnService;
import com.cibertec.clase3.infrastructure.database.dto.AlumnEntity;
import com.cibertec.clase3.infrastructure.database.repositories.AlumnRepository;
import com.fasterxml.jackson.databind.ObjectMapper;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
@RequiredArgsConstructor
public class AlumnServiceImplementation implements IAlumnService {
    private final AlumnRepository alumnRepository;
    private final ObjectMapper objectMapper;

    public List<AlumnResponse> getAllAlumnsServices() {
        Iterable<AlumnEntity> listAlumns = alumnRepository.findAll();
        /*List<AlumnResponse> response = StreamSupport.stream(listAlumns.spliterator(), false)
                .map(p -> objectMapper.convertValue(p, AlumnResponse.class))
                .toList();*/
        List<AlumnResponse> response = new ArrayList<>();
        for (AlumnEntity alumn : listAlumns) {
            AlumnResponse alumnResponse = objectMapper.convertValue(alumn, AlumnResponse.class);
            response.add(alumnResponse);
        }
        return response;
    }

    @Override
    public AlumnResponse saveAlumnServices(AlumnRequest alumnRequest) {
        var response = alumnRepository.save(objectMapper.convertValue(alumnRequest, AlumnEntity.class));
        return objectMapper.convertValue(response, AlumnResponse.class);
    }

    @Override
    public AlumnResponse getAlumnByIdServices(Long id) {
        var response = alumnRepository.findById(id).orElseThrow();
        return objectMapper.convertValue(response, AlumnResponse.class);
    }
}
