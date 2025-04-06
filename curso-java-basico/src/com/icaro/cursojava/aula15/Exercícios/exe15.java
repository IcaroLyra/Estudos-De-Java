package com.icaro.cursojava.aula15.Exercícios;

import java.util.Scanner;

public class exe15 {
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);

    System.out.println("Digite o valor do primeiro lado:");
    int l1 = scan.nextInt();

    System.out.println("Digite o valor do segundo lado:");
    int l2 = scan.nextInt();

    System.out.println("Digite o valor do terceiro lado:");
    int l3 = scan.nextInt();

    if (l1 + l2 > l3 && l1 + l3 > l2 && l2 + l3 > l1) {

      if (l1 == l2 && l2 == l3) {
        System.out.println("Esse triângulo é equilátero.");
      } else if (l1 == l2 || l2 == l3 || l1 == l3) {
        System.out.println("Esse triângulo é isósceles.");
      } else {
        System.out.println("Esse triângulo é escaleno.");
      }

    } else {
      System.out.println("Os valores não formam um triângulo válido.");
    }
    scan.close();
  }
}
