package com.icaro.cursojava.aula15.Exercícios;

import java.util.Scanner;

public class exe14 {
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);

    System.out.println("Valor da primeira prova:");
    double prova1 = scan.nextDouble();

    System.out.println("Valor da segunda prova:");
    double prova2 = scan.nextDouble();

    double media = (prova1 + prova2) / 2;

    System.out.printf("Sua média é: %.2f\n", media);

    if (media >= 9 && media <= 10) {
      System.out.println("Conceito: A");
      System.out.println("Aprovado");
    } else if (media >= 7.5 && media < 9) {
      System.out.println("Conceito: B");
      System.out.println("Aprovado");
    } else if (media >= 6 && media < 7.5) {
      System.out.println("Conceito: C");
      System.out.println("Aprovado");
    } else if (media >= 4 && media < 6) {
      System.out.println("Conceito: D");
      System.out.println("Reprovado");
    } else if (media >= 0 && media < 4) {
      System.out.println("Conceito: E");
      System.out.println("Reprovado");
    } else {
      System.out.println("Média inválida. Verifique os valores digitados.");
    }
  scan.close();
  }
}
