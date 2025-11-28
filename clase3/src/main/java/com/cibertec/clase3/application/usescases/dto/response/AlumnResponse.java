package com.cibertec.clase3.application.usescases.dto.response;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class AlumnResponse {
    private Long id;
    private String name;
    private String surname;
    private String email;
    private String phone;
    private String address;
}
