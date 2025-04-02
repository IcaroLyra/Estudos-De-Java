package com.icaro.cursojava.aula15.Exercícios;

import java.util.Scanner;

public class exe12 {
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);

    System.out.println("Qual é o valor da hora trabalhada:");
    double valorDaHora = scan.nextDouble();

    System.out.println("Quantidade de horas trabalhadas no mês:");
    double horasTrabalhada = scan.nextDouble();

    double salarioBruto = valorDaHora * horasTrabalhada;

    double ir = 0;

    if (salarioBruto <= 900) {
      ir = 0;
    } else if (salarioBruto <= 1500) {
      ir = salarioBruto * 0.05;
    } else if (salarioBruto <= 2500) {
      ir = salarioBruto * 0.10;
    } else {
      ir = salarioBruto * 0.20;
    }

    double sindicato = salarioBruto * 0.03;
    double fgts = salarioBruto * 0.11;
    double desconto = ir + sindicato;
    double salarioLiquido = salarioBruto - desconto;

    System.out.printf(
        "Salário Bruto: R$ %.2f\n(-) IR: R$ %.2f\n(-) Sindicato (3%%): R$ %.2f\nFGTS (11%%): R$ %.2f\nTotal de descontos: R$ %.2f\nSalário Líquido: R$ %.2f\n",
        salarioBruto, ir, sindicato, fgts, desconto, salarioLiquido);
  }
}
