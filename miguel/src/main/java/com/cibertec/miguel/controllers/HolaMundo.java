package com.cibertec.miguel.controllers;

import org.springframework.web.bind.annotation.*;

@RestController //Esta clase va a ser un controlador de tipo REST
@RequestMapping("/holaMundo") // Esta es la base de este controlador - Base de la ruta | Base del path
public class HolaMundo {

    @GetMapping // Es una operacion get con la ruta por defecto
    public String HolaMundo() {
        return "Hola Mundo";
    }

    @GetMapping("/hola2") // Es una operacion get con una ruta especifica
    public String Hola2() {
        return  "Hola Mundo 2";
    }
}
