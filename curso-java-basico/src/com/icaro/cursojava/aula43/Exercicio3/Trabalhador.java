package com.icaro.cursojava.aula43.Exercicio3;

public class Trabalhador extends Passageiro{
    public Trabalhador(String nome, String numeroDocumento, String tipoDocumento) {
        super(nome, numeroDocumento, tipoDocumento);
    }
    @Override
    public double calcularTarifa(double valorBase){
        return valorBase;
    }

}
