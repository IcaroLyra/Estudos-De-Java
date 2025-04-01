package com.icaro.cursojava.aula15.Exercícios;

import java.util.Scanner;

public class exe6 {
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);

    System.out.println("Primeiro valor:");
    double n1 = scan.nextDouble();

    System.out.println("Segundo valor:");
    double n2 = scan.nextDouble();

    System.out.println("Terceiro valor:");
    double n3 = scan.nextDouble();

    if (n1 > n2 && n1 > n3) {
      System.out.printf("%.2f é o maior entre eles\n", n1);
    }

    if (n2 > n1 && n2 > n3) {
      System.out.printf("%.2f é o maior entre eles\n", n2);
    }

    if (n3 > n1 && n3 > n2) {
      System.out.printf("%.2f é o maior entre eles\n", n3);
    }

    if (n1 < n2 && n1 < n3) {
      System.out.printf("%.2f é o menor entre eles\n", n1);
    }

    if (n2 < n1 && n2 < n3) {
      System.out.printf("%.2f é o menor entre eles\n", n2);
    }

    if (n3 < n1 && n3 < n2) {
      System.out.printf("%.2f é o menor entre eles\n", n3);
    }
  }
}
