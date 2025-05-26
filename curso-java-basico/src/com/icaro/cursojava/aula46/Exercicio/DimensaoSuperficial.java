package com.icaro.cursojava.aula46.Exercicio;

public interface DimensaoSuperficial {

    default double calcularArea(double valor, double valor2){
        return valor * valor2;
    };
}
