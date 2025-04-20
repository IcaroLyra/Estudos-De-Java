package com.icaro.cursojava.aula32;

public class TesteCarro {
    public static void main(String[] args) {

        Carro van = new Carro();

        van.setMarca("Fiat");
        van.setModelo("Teste");

        System.out.println(van.getMarca() + van.getModelo() );

    }
}
