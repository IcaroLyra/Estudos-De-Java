package com.icaro.cursojava.aula25;

public class Carro {

  String marca;
  String modelo;
  int numPassageiros;
  double capCombustivel;
  double consumoCombustivel;

  void exibirAutonimia() {

    System.out.println("A autonomia do carro é: " + capCombustivel * consumoCombustivel + " km");

  }

}
