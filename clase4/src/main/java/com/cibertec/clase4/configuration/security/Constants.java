package com.cibertec.clase4.configuration.security;

import io.jsonwebtoken.io.Decoders;
import io.jsonwebtoken.security.Keys;

import java.nio.charset.StandardCharsets;
import java.security.Key;

public class Constants {
    // Spring Security
    public static final String AUTHORIZATION_HEADER = "Authorization";
    public static final String TOKEN_BEARER_PREFIX = "Bearer ";

    // JWT
    public static final String SUPER_SECRET_KEY = "b4df1a9e8c7d2f45e6b1c9a0f3e7d6c2a1b4d5e6f7c8a9b0c1d2e3f4a5b6c7d8";
    public static final Long TOKEN_EXPIRATION_TIME = 300_000L;  //ms

    public static Key getSigningKeyB64(String secretKey) {
        byte[] keyBytes = Decoders.BASE64.decode(secretKey);
        return Keys.hmacShaKeyFor(keyBytes);
    }

    public static Key getSigningKey(String secretKey) {
        byte[] keyBytes = secretKey.getBytes(StandardCharsets.UTF_8);
        return Keys.hmacShaKeyFor(keyBytes);
    }

}
