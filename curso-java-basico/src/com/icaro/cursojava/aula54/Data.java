package com.icaro.cursojava.aula54;

public class Data {

    private int dia;
    private int mes;
    private int ano;
    private DiaSemana diaSemana;

    public Data(){
        super();
    }

    public Data(int dia, DiaSemana diaSemana, int ano, int mes) {
        this.dia = dia;
        this.diaSemana = diaSemana;
        this.ano = ano;
        this.mes = mes;
    }

    public int getDia() {
        return dia;
    }

    public void setDia(int dia) {
        this.dia = dia;
    }

    public int getMes() {
        return mes;
    }

    public void setMes(int mes) {
        this.mes = mes;
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    public DiaSemana getDiaSemana() {
        return diaSemana;
    }

    public void setDiaSemana(DiaSemana diaSemana) {
        this.diaSemana = diaSemana;
    }
}
