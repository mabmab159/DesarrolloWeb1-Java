package com.cibertec.clase2.services;

import com.cibertec.clase2.models.Carrera;
import com.cibertec.clase2.repositories.CarreraRepository;
import org.springframework.stereotype.Service;

@Service
public class CarreraService {
    private CarreraRepository carreraRepository;

    public CarreraService(CarreraRepository carreraRepository) {
        this.carreraRepository = carreraRepository;
    }

    public Iterable<Carrera> findAll() {
        return carreraRepository.findAll();
    }

    public Iterable<Carrera> findByCarrera(String carrera) {
        return carreraRepository.findByNombreCarreraContainingIgnoreCase(carrera);
    }
}
