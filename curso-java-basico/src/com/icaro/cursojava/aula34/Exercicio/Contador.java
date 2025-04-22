package com.icaro.cursojava.aula34.Exercicio;

public class Contador {
    static int contador;

    public Contador() {
        contador++;
    }

    public static void incrementar() {
        contador++;
    }

    public static void zerar() {
        contador = 0;
    }

    public static int getContador() {
        return contador;
    }
}

