package com.icaro.cursojava.aula33.Exercícios;

public class TesteLampada {
    public static void main(String[] args) {
        Lampada lampada = new Lampada("Philips", false, 9, 22.50, "Fluorescente");

        lampada.mostrarEstado();
        lampada.ligar();
        lampada.mostrarEstado();
        lampada.desligar();
        lampada.mostrarEstado();
    }
}
