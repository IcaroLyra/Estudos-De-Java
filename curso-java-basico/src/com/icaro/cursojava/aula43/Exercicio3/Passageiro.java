package com.icaro.cursojava.aula43.Exercicio3;

public abstract class Passageiro {
    private String nome;
    private String tipoDocumento;
    private String numeroDocumento;


    public Passageiro(String nome, String numeroDocumento, String tipoDocumento) {
        this.nome = nome;
        this.numeroDocumento = numeroDocumento;
        this.tipoDocumento = tipoDocumento;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNumeroDocumento() {
        return numeroDocumento;
    }

    public void setNumeroDocumento(String numeroDocumento) {
        this.numeroDocumento = numeroDocumento;
    }

    public String getTipoDocumento() {
        return tipoDocumento;
    }

    public void setTipoDocumento(String tipoDocumento) {
        this.tipoDocumento = tipoDocumento;
    }

    public abstract double calcularTarifa(double valorBase);
}
