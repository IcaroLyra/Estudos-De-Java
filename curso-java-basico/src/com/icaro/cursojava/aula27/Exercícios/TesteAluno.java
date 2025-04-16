package com.icaro.cursojava.aula27.Exercícios;

import java.util.Scanner;

public class TesteAluno {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        Aluno aluno = new Aluno();

        System.out.println("Digite seu nome:");
        aluno.nome = scanner.nextLine();

        System.out.println("Digite sua matrícula:");
        aluno.matricula = scanner.nextInt();
        scanner.nextLine();

        System.out.println("Digite seu curso:");
        aluno.curso = scanner.nextLine();

        System.out.println("\nDigite o nome das disciplinas");
        for (int i = 0; i < aluno.disciplinas.length; i++) {
            System.out.print("Disciplina " + (i + 1) + ": ");
            aluno.disciplinas[i] = scanner.nextLine();
        }

        System.out.println("\nDigite a nota de cada disciplina");
        for (int i = 0; i < aluno.notas.length; i++) {
            System.out.print("Nota para \"" + aluno.disciplinas[i] + "\": ");
            aluno.notas[i] = scanner.nextDouble();
        }

        aluno.informacoeDoAluno();

        System.out.println("\nResultado das disciplinas");
        for (int i = 0; i < aluno.notas.length; i++) {
            aluno.verificarAprovacao(i);
        }

        scanner.close();
    }
}
