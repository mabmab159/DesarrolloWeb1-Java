package com.cibertec.clase2.controllers;

import com.cibertec.clase2.services.CarreraService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("/carrera")
public class CarreraController {

    private CarreraService carreraService;

    public CarreraController(CarreraService carreraService) {
        this.carreraService = carreraService;
    }

    @GetMapping("/listar")
    public String listar(@RequestParam(required = false) String keyword, Model model) {
        //keyword -> Tipo String (nulo, vacio, string)
        if (keyword != null && !keyword.isEmpty()) {
            //Filtrar por carrera
            //1. Filtrar por base de datos - Mas optima | Reduce el mapeo de objetos
            model.addAttribute("carreras", carreraService.findByCarrera(keyword));
            System.out.println(carreraService.findByCarrera(keyword));
            //2. Filtrar en memoria - Solo usarlo cuando son pocos datos en la BD
        } else {
            model.addAttribute("carreras", carreraService.findAll());
        }
        model.addAttribute("keyword", keyword);
        return "carreras/listar";
    }

}
