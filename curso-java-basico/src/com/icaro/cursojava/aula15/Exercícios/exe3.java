package com.icaro.cursojava.aula15.Exercícios;

import java.util.Scanner;

public class exe3 {
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);

    System.out.println("Digite (F ou M):");
    String p1 = scan.nextLine().toLowerCase();

    switch (p1) {
      case "f":
        System.out.println("Feminino");
        break;
      case "m":
        System.out.println("Masculino");
        break;
      default:
        System.out.println("Sexo Inválido.");
        break;

    }
  }
}
