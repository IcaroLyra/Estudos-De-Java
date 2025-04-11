package com.icaro.cursojava.aula20.Exercícios;

import java.util.Random;

public class exe2 {
  public static void main(String[] args) {

    int[][] numerosAleatorios = new int[10][10];
    Random numeroRandom = new Random();

    for (int i = 0; i < numerosAleatorios.length; i++) {
      for (int j = 0; j < numerosAleatorios[i].length; j++) {
        numerosAleatorios[i][j] = numeroRandom.nextInt(10);
      }
    }

    System.out.println("Matriz gerada:");
    for (int i = 0; i < numerosAleatorios.length; i++) {
      for (int j = 0; j < numerosAleatorios[i].length; j++) {
        System.out.print(numerosAleatorios[i][j] + " ");
      }
      System.out.println();
    }

    int maiorLinha = numerosAleatorios[4][0];
    int menorLinha = numerosAleatorios[4][0];

    for (int j = 1; j < numerosAleatorios[4].length; j++) {
      if (numerosAleatorios[4][j] > maiorLinha) {
        maiorLinha = numerosAleatorios[4][j];
      }
      if (numerosAleatorios[4][j] < menorLinha) {
        menorLinha = numerosAleatorios[4][j];
      }
    }

    int maiorColuna = numerosAleatorios[0][6];
    int menorColuna = numerosAleatorios[0][6];

    for (int i = 1; i < numerosAleatorios.length; i++) {
      if (numerosAleatorios[i][6] > maiorColuna) {
        maiorColuna = numerosAleatorios[i][6];
      }
      if (numerosAleatorios[i][6] < menorColuna) {
        menorColuna = numerosAleatorios[i][6];
      }
    }

    System.out.println("\nLinha 5 (índice 4): maior = " + maiorLinha + ", menor = " + menorLinha);
    System.out.println("Coluna 7 (índice 6): maior = " + maiorColuna + ", menor = " + menorColuna);
  }
}
