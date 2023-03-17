package com.dh.c20231.springboot.primerejemplo.service;

import com.dh.c20231.springboot.primerejemplo.model.Entrenador;
import com.dh.c20231.springboot.primerejemplo.model.X;
import com.dh.c20231.springboot.primerejemplo.persistence.EntrenadorDao;

import java.util.List;

public class EjemploService {

    private EntrenadorDao dao = new EntrenadorDao();

    public String procesarPeticion() {
        X objetoX = new X();

        return objetoX.toString();
    }


    public List<Entrenador> getEntrenadores() {
        List<Entrenador> resultado = dao.getEntrenadores();

        return resultado;
    }
}
