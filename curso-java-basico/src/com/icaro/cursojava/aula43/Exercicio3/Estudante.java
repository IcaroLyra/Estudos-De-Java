package com.icaro.cursojava.aula43.Exercicio3;

public class Estudante extends Passageiro
{
    private String instituicaoEnsino ;

    public Estudante(String nome, String numeroDocumento, String tipoDocumento, String instituicaoEnsino) {
        super(nome, numeroDocumento, tipoDocumento);
        this.instituicaoEnsino = instituicaoEnsino;
    }

    public String getInstituicaoEnsino() {
        return instituicaoEnsino;
    }

    public void setInstituicaoEnsino(String instituicaoEnsino) {
        this.instituicaoEnsino = instituicaoEnsino;
    }

    @Override
    public double calcularTarifa(double valorBase){
        return  valorBase * 0.5;

    }



}
