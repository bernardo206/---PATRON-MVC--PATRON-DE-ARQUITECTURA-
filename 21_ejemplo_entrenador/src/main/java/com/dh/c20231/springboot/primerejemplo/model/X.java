package com.dh.c20231.springboot.primerejemplo.model;

public class X {
    public String atributoX = "valor X";

    public String describir(){
        return "Este es el método de la clase X";
    }

    @Override
    public String toString() {
        return "Objeto X [" +
                "atributoX='" + atributoX + '\'' +
                ']';
    }
}
