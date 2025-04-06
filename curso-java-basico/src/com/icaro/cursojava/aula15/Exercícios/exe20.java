package com.icaro.cursojava.aula15.Exercícios;

import java.util.Scanner;

public class exe20 {
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);

    System.out.println("Digite a primeira nota:");
    double n1 = scan.nextDouble();

    System.out.println("Digite a segunda nota:");
    double n2 = scan.nextDouble();

    System.out.println("Digite a terceira nota:");
    double n3 = scan.nextDouble();

    double media = (n1 + n2 + n3) / 3;

    System.out.printf("Sua média foi: %.2f\n", media);

    if (media == 10) {
      System.out.println("Aprovado com Distinção!");
    } else if (media >= 7) {
      System.out.println("Aprovado!");
    } else {
      System.out.println("Reprovado.");
    }

    scan.close();
  }
}
