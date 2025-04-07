package com.icaro.cursojava.aula15.Exercícios;

import java.util.Scanner;

public class exe26 {
  public static void main(String[] args) {

    Scanner scan = new Scanner(System.in);

    double precoGasolina = 2.50;
    double precoAlcool = 1.90;

    System.out.println("Digite 'A' para Álcool ou 'G' para Gasolina: ");
    String tipoCombustivel = scan.next().toUpperCase();

    System.out.println("Quantos litros você deseja colocar?");
    double litros = scan.nextDouble();

    double precoComDesconto = 0;
    double total = 0;

    switch (tipoCombustivel) {
      case "A":
        System.out.println("Você escolheu Álcool");
        if (litros <= 20) {
          precoComDesconto = precoAlcool * 0.97;
        } else {
          precoComDesconto = precoAlcool * 0.95;
        }
        total = litros * precoComDesconto;
        break;

      case "G":
        System.out.println("Você escolheu Gasolina");
        if (litros <= 20) {
          precoComDesconto = precoGasolina * 0.96;
        } else {
          precoComDesconto = precoGasolina * 0.94;
        }
        total = litros * precoComDesconto;
        break;

      default:
        System.out.println("Opção inválida. Digite apenas 'A' ou 'G'.");
        scan.close();
        return;
    }

    System.out.printf("Preço com desconto por litro: R$ %.2f%n", precoComDesconto);
    System.out.printf("Total a pagar: R$ %.2f%n", total);

    scan.close();
  }
}
