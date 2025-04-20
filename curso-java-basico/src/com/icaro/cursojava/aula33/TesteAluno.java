package com.icaro.cursojava.aula33;

import java.util.Scanner;

public class TesteAluno {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o nome do aluno: ");
        String nome = scanner.nextLine();

        System.out.print("Digite a matrícula: ");
        int matricula = scanner.nextInt();
        scanner.nextLine();

        System.out.print("Digite o curso: ");
        String curso = scanner.nextLine();

        String[] disciplinas = new String[3];
        double[] notas = new double[3];

        for (int i = 0; i < disciplinas.length; i++) {
            System.out.print("Digite o nome da disciplina " + (i + 1) + ": ");
            disciplinas[i] = scanner.nextLine();

            System.out.print("Digite a nota da disciplina " + disciplinas[i] + ": ");
            notas[i] = scanner.nextDouble();
            scanner.nextLine();
        }

        Aluno aluno = new Aluno(nome, notas, disciplinas, curso, matricula);

        System.out.println("\nResultado das disciplinas:");
        aluno.verificarAprovacao();

        scanner.close();
    }
}
