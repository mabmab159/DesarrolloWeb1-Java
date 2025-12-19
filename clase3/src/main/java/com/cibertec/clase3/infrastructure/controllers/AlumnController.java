package com.cibertec.clase3.infrastructure.controllers;

import com.cibertec.clase3.application.usescases.dto.request.AlumnRequest;
import com.cibertec.clase3.application.usescases.dto.response.AlumnResponse;
import com.cibertec.clase3.application.usescases.interfaces.IAlumnInterface;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/alumn")
@RequiredArgsConstructor
@CrossOrigin(origins = "*")
public class AlumnController {
    private final IAlumnInterface alumnInterface;

    @GetMapping("/list")
    public ResponseEntity<List<AlumnResponse>> listAllAlumns() {
        return ResponseEntity.ok(alumnInterface.getAllAlumns());
    }

    @GetMapping("/{id}")
    public ResponseEntity<AlumnResponse> getAlumnById(@PathVariable String id) {
        Long idAlumn = Long.parseLong(id);
        return ResponseEntity.ok(alumnInterface.getAlumnById(idAlumn));
    }

    @PostMapping("/save")
    public ResponseEntity<AlumnResponse> saveAlumn(@Valid @RequestBody AlumnRequest alumnRequest) {
        return ResponseEntity.ok(alumnInterface.saveAlumn(alumnRequest));
    }
}
