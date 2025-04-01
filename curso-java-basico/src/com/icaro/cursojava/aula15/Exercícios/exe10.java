package com.icaro.cursojava.aula15.Exercícios;

import java.util.Scanner;

public class exe10 {
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);

    System.out.println("Qual turno você estuda?");
    System.out.println("Digite: M - Matutino | V - Vespertino | N - Noturno");

    String t1 = scan.nextLine().toLowerCase();

    if (t1.length() == 1 && Character.isLetter(t1.charAt(0))) {
      switch (t1) {
        case "m":
          System.out.println("Bom Dia!");
          break;
        case "v":
          System.out.println("Boa Tarde!");
          break;
        case "n":
          System.out.println("Boa Noite!");
          break;
        default:
          System.out.println("Valor Inválido!");
          break;
      }
    } else {
      System.out.println("Entrada inválida. Digite apenas uma letra.");
    }
  }
}
