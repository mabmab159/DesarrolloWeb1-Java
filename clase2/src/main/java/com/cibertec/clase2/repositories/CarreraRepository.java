package com.cibertec.clase2.repositories;

import com.cibertec.clase2.models.Carrera;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CarreraRepository extends CrudRepository<Carrera, Long> {
    Iterable<Carrera> findByNombreCarreraContainingIgnoreCase(String nombreCarrera);

    @Query("select c From Carrera c where c.nombreCarrera = :nombreCarrera")
    Iterable<Carrera> busqueda2(String nombreCarrera);
}
