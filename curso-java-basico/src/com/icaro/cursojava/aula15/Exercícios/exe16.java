package com.icaro.cursojava.aula15.Exercícios;

import java.util.Scanner;

public class exe16 {
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);

    System.out.println("Digite o valor de a: ");
    double a = scan.nextDouble();

    if (a == 0) {
      System.out.println("A equação não é do segundo grau. Encerrando o programa.");
      System.exit(0);
    }

    System.out.println("Digite o valor de b: ");
    double b = scan.nextDouble();

    System.out.println("Digite o valor de c: ");
    double c = scan.nextDouble();

    double delta = b * b - 4 * a * c;

    if (delta < 0) {
      System.out.println("A equação não possui raízes reais.");
      System.exit(0);
    } else if (delta == 0) {
      double raiz = -b / (2 * a);
      System.out.println("A equação possui uma única raiz real.");
      System.out.println("O valor da raiz é " + raiz);
    } else {
      double raiz1 = (-b + Math.sqrt(delta)) / (2 * a);
      double raiz2 = (-b - Math.sqrt(delta)) / (2 * a);
      System.out.println("A equação possui duas raízes reais diferentes.");
      System.out.println("O valor da primeira raiz é " + raiz1);
      System.out.println("O valor da segunda raiz é " + raiz2);
    }

    scan.close();
  }
}
