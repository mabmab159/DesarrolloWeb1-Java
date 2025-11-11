package com.cibertec.clase1.entidades;

import jakarta.persistence.*;

@Entity(name = "AlumnosTabla")
@Table(name = "Alumnos")
public class Alumno {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(name = "name")
    private String nombre;
    @Column(name = "lastName")
    private String apellido;
    private String carrera;
    private Long codigoEstudiante;
    private double promedioNotas;
}
