package com.icaro.cursojava.aula43.Exercicio2;

public abstract class Contribuinte {
    private String nome;
    private  Double rendaBruta;

    public Contribuinte(String nome, Double rendaBruta) {
        this.nome = nome;
        this.rendaBruta = rendaBruta;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Double getRendaBruta() {
        return rendaBruta;
    }

    public void setRendaBruta(Double rendaBruta) {
        this.rendaBruta = rendaBruta;
    }


    public abstract double calcularImposto();


}
