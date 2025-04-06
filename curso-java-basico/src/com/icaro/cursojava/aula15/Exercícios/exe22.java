package com.icaro.cursojava.aula15.Exercícios;

import java.util.Scanner;

public class exe22 {
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);

    System.out.print("Escolha um número inteiro: ");
    int n1 = scan.nextInt();

    if (n1 % 2 == 0) {
      System.out.println("Este número é par.");
    } else {
      System.out.println("Este número é ímpar.");
    }

    scan.close();
  }
}
