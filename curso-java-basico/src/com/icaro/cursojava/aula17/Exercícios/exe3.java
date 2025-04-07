package com.icaro.cursojava.aula17.Exercícios;

import java.util.Scanner;

public class exe3 {
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);

    String nome;
    int idade;
    double salario;
    String sexo;
    String estadoCivil;

    do {
      System.out.println("Informe o nome (mais de 3 caracteres):");
      nome = scan.nextLine();

      System.out.println("Informe a idade (entre 0 e 150):");
      idade = scan.nextInt();

      System.out.println("Informe o salário (maior que 0):");
      salario = scan.nextDouble();

      System.out.println("Informe o sexo ('f' para feminino ou 'm' para masculino):");
      sexo = scan.nextLine();

      System.out.println("Informe o estado civil ('s' - solteiro, 'c' - casado, 'v' - viúvo, 'd' - divorciado):");
      estadoCivil = scan.nextLine();

      if (nome.length() <= 3) {
        System.out.println("Erro: o nome deve conter mais de 3 caracteres.");
      }

      if (idade < 0 || idade > 150) {
        System.out.println("Erro: a idade deve estar entre 0 e 150 anos.");
      }

      if (salario <= 0) {
        System.out.println("Erro: o salário deve ser maior que zero.");
      }

      if (!sexo.equalsIgnoreCase("f") && !sexo.equalsIgnoreCase("m")) {
        System.out.println("Erro: o sexo deve ser 'f' para feminino ou 'm' para masculino.");
      }

      if (!estadoCivil.equalsIgnoreCase("s") &&
          !estadoCivil.equalsIgnoreCase("c") &&
          !estadoCivil.equalsIgnoreCase("v") &&
          !estadoCivil.equalsIgnoreCase("d")) {
        System.out.println("Erro: o estado civil deve ser 's', 'c', 'v' ou 'd'.");
      }

    } while (nome.length() <= 3 ||
        idade < 0 || idade > 150 ||
        salario <= 0 ||
        (!sexo.equalsIgnoreCase("f") && !sexo.equalsIgnoreCase("m")) ||
        (!estadoCivil.equalsIgnoreCase("s") &&
            !estadoCivil.equalsIgnoreCase("c") &&
            !estadoCivil.equalsIgnoreCase("v") &&
            !estadoCivil.equalsIgnoreCase("d")));

    System.out.println("Dados válidos cadastrados com sucesso!");
    scan.close();
  }
}
