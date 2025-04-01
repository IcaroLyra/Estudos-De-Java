package com.icaro.cursojava.aula15.Exercícios;

import java.util.Scanner;

public class exe4 {
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);

    System.out.println("Digite uma letra:");
    String l1 = scan.nextLine().toLowerCase();

    // Verifica se a entrada tem apenas um caractere e é uma letra
    if (l1.length() == 1 && Character.isLetter(l1.charAt(0))) {
      switch (l1) {
        case "a":
        case "e":
        case "i":
        case "o":
        case "u":
          System.out.println("É uma vogal.");
          break;
        default:
          System.out.println("É uma consoante.");
          break;
      }
    } else {
      System.out.println("Entrada inválida. Digite apenas uma letra.");
    }
  }
}
