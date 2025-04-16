package com.icaro.cursojava.aula27.Exercícios;

public class Lampada {

    int potencia;
    String tipo;
    String corLuz;
    boolean ligada;


    void ligar(){
        ligada  = true  ;

    }

    void desligar(){
        ligada = false;
    }

    void mostrarEstado(){
        if (ligada){
            System.out.println("A lampada esta ligada");
        }else {
            System.out.println("Esta desligada");
        }
    }

}
