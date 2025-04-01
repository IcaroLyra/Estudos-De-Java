package com.icaro.cursojava.aula15.Exercícios;

import java.util.Scanner;

public class exe2 {
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);

    System.out.println("Digite um número:");
    double n1 = scan.nextDouble();

    if (n1 > 0) {
      System.out.printf("%.2f é positivo\n", n1);
    } else if (n1 == 0) {
      System.out.printf("%.2f é neutro\n", n1);
    } else {
      System.out.printf("%.2f é negativo\n", n1);
    }
  }
}
