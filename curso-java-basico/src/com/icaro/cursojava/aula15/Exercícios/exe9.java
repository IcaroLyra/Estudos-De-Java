package com.icaro.cursojava.aula15.Exercícios;

import java.util.Scanner;

public class exe9 {
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);

    System.out.println("Digite o primeiro número:");
    double n1 = scan.nextDouble();

    System.out.println("Digite o segundo número:");
    double n2 = scan.nextDouble();

    System.out.println("Digite o terceiro número:");
    double n3 = scan.nextDouble();

    System.out.println("Números em ordem decrescente:");

    if (n1 >= n2 && n1 >= n3) {
      if (n2 >= n3) {
        System.out.printf("%.2f\n%.2f\n%.2f\n", n1, n2, n3);
      } else {
        System.out.printf("%.2f\n%.2f\n%.2f\n", n1, n3, n2);
      }
    } else if (n2 >= n1 && n2 >= n3) {
      if (n1 >= n3) {
        System.out.printf("%.2f\n%.2f\n%.2f\n", n2, n1, n3);
      } else {
        System.out.printf("%.2f\n%.2f\n%.2f\n", n2, n3, n1);
      }
    } else {
      if (n1 >= n2) {
        System.out.printf("%.2f\n%.2f\n%.2f\n", n3, n1, n2);
      } else {
        System.out.printf("%.2f\n%.2f\n%.2f\n", n3, n2, n1);
      }
    }
  }
}
