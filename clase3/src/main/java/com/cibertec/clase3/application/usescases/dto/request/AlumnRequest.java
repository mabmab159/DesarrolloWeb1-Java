package com.cibertec.clase3.application.usescases.dto.request;

import jakarta.validation.constraints.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class AlumnRequest {
    //@Pattern(regexp = "^[A-Za-z][0-9]{8,10}$")
    private String codigoAlumno;
    //@NotNull(message = "Name is required")
    private String name;
    //@NotNull(message = "Surname is required")
    private String surname;
    //@Email
    private String email;
    //@Min(9)
    private String phone;
    //@Max(256)
    private String address;
}
