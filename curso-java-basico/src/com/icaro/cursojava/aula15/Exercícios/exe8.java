package com.icaro.cursojava.aula15.Exercícios;

import java.util.Scanner;

public class exe8 {
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);

    System.out.println("Qual é o valor do primeiro produto:");
    double p1 = scan.nextDouble();

    System.out.println("Qual é o valor do segundo produto:");
    double p2 = scan.nextDouble();

    System.out.println("Qual é o valor do terceiro produto:");
    double p3 = scan.nextDouble();

    if (p1 < p2 && p1 < p3) {
      System.out.printf("Você deve comprar o primeiro produto (R$ %.2f)\n", p1);
    } else if (p2 < p1 && p2 < p3) {
      System.out.printf("Você deve comprar o segundo produto (R$ %.2f)\n", p2);
    } else if (p3 < p1 && p3 < p2) {
      System.out.printf("Você deve comprar o terceiro produto (R$ %.2f)\n", p3);
    } else {
      System.out.println("Há dois ou mais produtos com o mesmo menor preço.");
    }
  }
}
