package com.dh.c20231.springboot.primerejemplo.persistence;

import com.dh.c20231.springboot.primerejemplo.model.Entrenador;

import java.util.List;

public class EntrenadorDao {
    private List entrenadores = List.of(new Entrenador("Pekerman"), new Entrenador("Scaloni"));

    public List<Entrenador> getEntrenadores() {
        return entrenadores;
    }

    public void setEntrenadores(List<Entrenador> entrenadores) {
        this.entrenadores = entrenadores;
    }
}
