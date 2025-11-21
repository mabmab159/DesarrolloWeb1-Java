package com.cibertec.clase2.controllers;

import com.cibertec.clase2.services.CarreraService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/carrera")
public class CarreraController {

    private CarreraService carreraService;

    public CarreraController(CarreraService carreraService) {
        this.carreraService = carreraService;
    }

    @GetMapping("/listar")
    public String listar(Model model){
        model.addAttribute("carreras", carreraService.findAll());
        return "carreras/listar";
    }

}
