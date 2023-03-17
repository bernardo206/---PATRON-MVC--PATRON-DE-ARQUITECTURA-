package com.dh.c20231.springboot.primerejemplo.controllers;

import com.dh.c20231.springboot.primerejemplo.service.EjemploService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EjemploController {

    private EjemploService servicio = new EjemploService();

    @GetMapping("saludar")
    public String saludar(){
        return "Hola!";
    }

    @GetMapping("año")
    public int quéAñoEs(){
        return 2023;
    }

    @GetMapping("servicioX")
    public String servicioX(){
        String respuestaDelServicio = servicio.procesarPeticion();

        return respuestaDelServicio;
    }
}
