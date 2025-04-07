package com.icaro.cursojava.aula17.Exercícios;

import java.util.Scanner;

public class exe1 {
  public static void main(String[] args) {

    Scanner scan = new Scanner(System.in);
    double nota;

    do {
      System.out.println("Digite o valor da nota entre (0-10): ");
      nota = scan.nextDouble();
      if (nota < 0 || nota > 10) {
        System.out.println("Valor invalido");

      }

    } while (nota < 0 || nota > 10);

    System.out.println("Nota válida: " + nota);
    scan.close();

  }

}
