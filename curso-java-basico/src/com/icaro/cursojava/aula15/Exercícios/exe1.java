package com.icaro.cursojava.aula15.Exercícios;

import java.util.Scanner;

public class exe1 {
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);

    System.out.println("Digite o primeiro número:");
    int n1 = scan.nextInt();

    System.out.println("Digite o segundo número:");
    int n2 = scan.nextInt();

    if (n1 > n2) {
      System.out.printf("%d é maior\n", n1);
    } else if (n2 > n1) {
      System.out.printf("%d é maior\n", n2);
    } else {
      System.out.println("Os dois números são iguais");
    }

  }

}
