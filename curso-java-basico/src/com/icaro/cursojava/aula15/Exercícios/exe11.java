package com.icaro.cursojava.aula15.Exercícios;

import java.util.Scanner;

public class exe11 {
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);

    System.out.print("Informe o seu salário atual: R$ ");
    double salarioAtual = scan.nextDouble();

    double percentual = 0;

    if (salarioAtual <= 280) {
      percentual = 0.20;
    } else if (salarioAtual <= 700) {
      percentual = 0.15;
    } else if (salarioAtual <= 1500) {
      percentual = 0.10;
    } else {
      percentual = 0.05;
    }

    double aumento = salarioAtual * percentual;
    double novoSalario = salarioAtual + aumento;

    System.out.printf("\nSalário antes do reajuste: R$ %.2f\n", salarioAtual);
    System.out.printf("Percentual de aumento aplicado: %.0f%%\n", percentual * 100);
    System.out.printf("Valor do aumento: R$ %.2f\n", aumento);
    System.out.printf("Novo salário após o aumento: R$ %.2f\n", novoSalario);
  }
}
