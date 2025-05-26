package com.icaro.cursojava.aula46.Exercicio;

public interface DimensaoVolumetrica {

    default double calcularVolume(double valor, double valor2, double valor3){
        return valor * valor2 * valor3;
    };
}

