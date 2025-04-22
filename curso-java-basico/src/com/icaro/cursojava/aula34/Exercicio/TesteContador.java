package com.icaro.cursojava.aula34.Exercicio;

public class TesteContador {
    public static void main(String[] args) {
        new Contador();
        new Contador();
        Contador.incrementar();
        System.out.println("Valor: " + Contador.getContador()); // saída: 3
        Contador.zerar();
        System.out.println("Valor após zerar: " + Contador.getContador()); // saída: 0
    }
}

