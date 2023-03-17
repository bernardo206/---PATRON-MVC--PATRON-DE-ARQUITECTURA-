package com.dh.c20231.springboot.primerejemplo.controllers;

import com.dh.c20231.springboot.primerejemplo.model.Entrenador;
import com.dh.c20231.springboot.primerejemplo.service.EjemploService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class EntrenadorController {

    EjemploService service = new EjemploService();

    @GetMapping("entrenadores")
    public List<Entrenador> verTodosLosEntrenadores(){
        return service.getEntrenadores();
    }

}
