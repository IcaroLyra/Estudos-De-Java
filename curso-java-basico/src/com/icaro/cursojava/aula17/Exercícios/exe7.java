package com.icaro.cursojava.aula17.Exercícios;

import java.util.Scanner;

public class exe7 {
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);

    int maior = Integer.MIN_VALUE;
    System.out.println("Digite 5 números:");

    for (int i = 1; i <= 5; i++) {
      System.out.print("Número " + i + ": ");

      int num = scan.nextInt();

      if (num > maior) {
        maior = num;
      }
    }

    scan.close();

    System.out.println("O maior número digitado foi: " + maior);
  }

}
