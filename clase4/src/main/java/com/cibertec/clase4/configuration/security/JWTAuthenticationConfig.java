package com.cibertec.clase4.configuration.security;

import io.jsonwebtoken.Claims;
import io.jsonwebtoken.Jwts;
import io.jsonwebtoken.SignatureAlgorithm;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.AuthorityUtils;

import java.util.Date;
import java.util.List;
import java.util.stream.Collectors;

import static com.cibertec.clase4.configuration.security.Constants.*;

@Configuration
public class JWTAuthenticationConfig {

    public String getJWTToken(String username, String nombre, String apellidos) {
        List<GrantedAuthority> grantedAuthorityList = AuthorityUtils
                .commaSeparatedStringToAuthorityList("ROLE_USER,ROLE_ADMIN");

        String token = Jwts.builder()
                .setId("Clase4")
                .setSubject(username)
                .claim("nombre", nombre)
                .claim("apellidos", apellidos)
                .claim("authorities", grantedAuthorityList.stream()
                        .map(GrantedAuthority::getAuthority)
                        .collect(Collectors.toList()))
                .setIssuedAt(new Date(System.currentTimeMillis()))
                .setExpiration(new Date(System.currentTimeMillis() + TOKEN_EXPIRATION_TIME))
                .signWith(getSigningKey(SUPER_SECRET_KEY), SignatureAlgorithm.HS512)
                .compact();
        return token;
    }

    public Claims decodeToken(String token) {
        Claims claims = Jwts.parser()
                .setSigningKey(getSigningKey(SUPER_SECRET_KEY))
                .build()
                .parseClaimsJws(token).getBody();
        return claims;
    }
}
