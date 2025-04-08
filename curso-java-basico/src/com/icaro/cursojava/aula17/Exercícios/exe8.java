package com.icaro.cursojava.aula17.Exercícios;

import java.util.Scanner;

public class exe8 {

  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);

    double soma = 0;
    double media = 0;

    System.out.println("Digite 5 números:");

    for (int i = 1; i <= 5; i++) {
      System.out.println("Numero" + i + ": ");
      double num = scan.nextDouble();
      soma += num;

    }
    media = soma / 5;
    System.out.println("Valor da soma e: " + soma);
    System.out.println("Valor da media e: " + media);

    scan.close();

  }
}
