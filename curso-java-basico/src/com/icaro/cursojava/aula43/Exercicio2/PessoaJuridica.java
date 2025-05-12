package com.icaro.cursojava.aula43.Exercicio2;

public class PessoaJuridica extends Contribuinte{

    public PessoaJuridica(String nome, Double rendaBruta) {
        super(nome, rendaBruta);
    }
    @Override
    public double calcularImposto(){
        return this.getRendaBruta() * 0.1;
    }
}
