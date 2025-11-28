package com.cibertec.clase3.infrastructure.controllers;

import com.cibertec.clase3.application.usescases.dto.request.AlumnRequest;
import com.cibertec.clase3.application.usescases.dto.response.AlumnResponse;
import com.cibertec.clase3.application.usescases.interfaces.IAlumnInterface;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/alumn")
@RequiredArgsConstructor
public class AlumnController {
    private final IAlumnInterface alumnInterface;

    @GetMapping("/list")
    public ResponseEntity<?> listAllAlumns() {
        return ResponseEntity.ok(alumnInterface.getAllAlumns());
    }

    @PostMapping("/save")
    public ResponseEntity<AlumnResponse> saveAlumn(@Valid @RequestBody AlumnRequest alumnRequest) {
        return ResponseEntity.ok(alumnInterface.saveAlumn(alumnRequest));
    }
}
