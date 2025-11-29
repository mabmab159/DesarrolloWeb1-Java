package com.cibertec.clase3.infrastructure.database.dto;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Entity
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "alumn")
public class AlumnEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String codigoAlumno;
    private String name;
    private String surname;
    private String email;
    private String phone;
    private String address;
    @Version
    private Long version; //Este campo es solo para manejo de versión | Bloqueo optimista
}
