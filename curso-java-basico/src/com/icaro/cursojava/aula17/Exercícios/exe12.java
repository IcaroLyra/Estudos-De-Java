package com.icaro.cursojava.aula17.Exercícios;

import java.util.Scanner;

public class exe12 {
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);

    int escolha = 1;
    int max = 10;

    do {
      System.out.println("Escolha um valor de (1 - 10) para mostrar a tabuada: ");

      escolha = scan.nextInt();
      if (escolha < 1 || escolha > 10) {
        System.out.println("Erro: O valor tem que ser de 1 ate 10");

      }

    } while (escolha < 1 || escolha > 10);

    for (int i = 1; i <= max; i++) {
      int resultado = i * escolha;
      System.out.println(escolha + "*" + i + "=" + resultado);

    }
    scan.close();

  }

}
