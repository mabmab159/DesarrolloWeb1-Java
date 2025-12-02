package com.cibertec.clase4.infrastructure.controllers;

import com.cibertec.clase4.application.caseuses.interfaces.IRickUseCase;
import com.cibertec.clase4.application.dtos.ResponseDTO;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/person")
@RequiredArgsConstructor
public class RickController {
    private final IRickUseCase iRickUseCase;

    @GetMapping("/{id}")
    public ResponseEntity<ResponseDTO> getPerson(@PathVariable String id) {
        return ResponseEntity.ok(iRickUseCase.getPerson(id));
    }
}
