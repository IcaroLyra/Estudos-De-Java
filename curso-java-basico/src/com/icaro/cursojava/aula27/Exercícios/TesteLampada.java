package com.icaro.cursojava.aula27.Exercícios;

public class TesteLampada {
    public static void main(String[] args) {
        Lampada lampada = new Lampada();
        lampada.corLuz ="branca";
        lampada.potencia = 10;

        lampada.mostrarEstado();

        lampada.ligar();
        lampada.mostrarEstado();

        lampada.desligar();
        lampada.mostrarEstado();

    }
}
