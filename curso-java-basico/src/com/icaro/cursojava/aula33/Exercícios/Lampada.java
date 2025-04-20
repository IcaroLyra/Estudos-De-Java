package com.icaro.cursojava.aula33.Exercícios;

public class Lampada {

   private String marca;
   private String modelo;
   private Double preco;
   private int potencia;
   private boolean ligado;

    public Lampada(String marca, boolean ligado, int potencia, Double preco, String modelo) {
        this.marca = marca;
        this.ligado = ligado;
        this.potencia = potencia;
        this.preco = preco;
        this.modelo = modelo;
    }


    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public boolean isLigado() {
        return ligado;
    }

    public void setLigado(boolean ligado) {
        this.ligado = ligado;
    }

    public int getPotencia() {
        return potencia;
    }

    public void setPotencia(int potencia) {
        this.potencia = potencia;
    }

    public Double getPreco() {
        return preco;
    }

    public void setPreco(Double preco) {
        this.preco = preco;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }


    public void ligar(){
       ligado = true;
        System.out.println("Você ligou a lampada");
    }
    public void desligar(){
        ligado = false;
        System.out.println("Você ligou a desligou");
    }

    public void mostrarEstado() {
        if (ligado) {
            System.out.println("A lâmpada está ligada.");
        } else {
            System.out.println("A lâmpada está desligada.");
        }
    }
}
