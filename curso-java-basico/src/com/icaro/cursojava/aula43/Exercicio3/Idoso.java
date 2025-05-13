package com.icaro.cursojava.aula43.Exercicio3;

public class Idoso extends Passageiro{

    public Idoso(String nome, String numeroDocumento, String tipoDocumento) {
        super(nome, numeroDocumento, tipoDocumento);
    }

    @Override
    public double calcularTarifa(double valorBase){
        return 0.0;
    }
}
