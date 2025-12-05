package com.cibertec.clase4.infrastructure.controllers;

import com.cibertec.clase4.configuration.security.JWTAuthenticationConfig;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
public class LoginController {

    private final JWTAuthenticationConfig jwtAuthenticationConfig;

    @PostMapping("/login")
    public ResponseEntity<String> login() {
        return ResponseEntity.ok(jwtAuthenticationConfig.getJWTToken("MabMab", "Miguel", "Berrio"));
    }
}
