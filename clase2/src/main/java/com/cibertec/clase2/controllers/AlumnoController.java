package com.cibertec.clase2.controllers;

import com.cibertec.clase2.models.Alumno;
import com.cibertec.clase2.services.AlumnoService;
import com.cibertec.clase2.services.CarreraService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.ArrayList;
import java.util.List;

@Controller
@RequestMapping("/")
public class AlumnoController {

    private AlumnoService alumnoService;
    private CarreraService carreraService;

    public AlumnoController(AlumnoService alumnoService, CarreraService carreraService) {
        this.alumnoService = alumnoService;
        this.carreraService = carreraService;
    }

    @GetMapping
    public String holaMundo(Model model) {
        model.addAttribute("mensaje", "Este es el mensaje desde el controlador");
        //Creando una lista de alumnos
        List<Alumno> alumnos = new ArrayList<>();
        alumnos.add(new Alumno("Miguel", "Berrio2"));
        alumnos.add(new Alumno("Juan", "Berrio3"));
        alumnos.add(new Alumno("Diego", "Berrio4"));
        model.addAttribute("alumnos", alumnos);
        // int, double, boolean, char, Integer, Double, Boolean, String
        return "alumnos/index";
    }

    @GetMapping("/alumnos")
    public String getAllAlumnos(Model model) {
        model.addAttribute("alumnos", alumnoService.findAll());
        return "alumnos/alumnos";
    }

    @GetMapping("/nuevo")
    public String nuevoAlumno(Model model) {
        model.addAttribute("alumno", new Alumno());
        model.addAttribute("carreras", carreraService.findAll()); //Agregamos la información de las carreras
        return "alumnos/nuevoAlumno";
    }

    @PostMapping("/save")
    public String guardarAlumno(@ModelAttribute Alumno alumno) {
        alumnoService.save(alumno);
        return "redirect:/alumnos/alumnos";
    }
}
