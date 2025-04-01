package com.icaro.cursojava.aula15.Exercícios;

import java.util.Scanner;

public class exe5 {
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);

    System.out.println("Primeira nota:");
    double n1 = scan.nextDouble();
    System.out.println("Segunda nota:");
    double n2 = scan.nextDouble();

    double media = (n1 + n2) / 2;
    System.out.printf("Média: %.2f\n", media);

    if (media == 10) {
      System.out.println("Parabéns! Você tirou a média máxima!");
    } else if (media >= 7)
      System.out.println("Parabéns! Você foi aprovado.");
    else {
      System.out.println("Você foi reprovado.");
    }

  }

}
