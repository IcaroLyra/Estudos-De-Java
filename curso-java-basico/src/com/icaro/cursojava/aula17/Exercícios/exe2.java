package com.icaro.cursojava.aula17.Exercícios;

import java.util.Scanner;

public class exe2 {
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    String nome;
    String senha;

    do {
      System.out.println("Digite o nome do usuario: ");
      nome = scan.nextLine();
      System.out.println("Digite a senha do usuario: ");
      senha = scan.nextLine();
      if (nome.equals(senha)) {
        System.out.println("Erro: o nome de usuário não pode ser igual à senha.");

      }

    } while (nome.equals(senha));
    System.out.println("Registrado com sucesso");
    scan.close();

  }

}
