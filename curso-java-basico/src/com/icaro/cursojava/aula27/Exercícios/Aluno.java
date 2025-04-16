
package com.icaro.cursojava.aula27.Exercícios;

public class Aluno {
    String nome;
    int matricula;
    String curso;

    String[] disciplinas = new String[3];
    double[] notas = new double[3];

    public void verificarAprovacao(int indice) {
        if (notas[indice] >= 7) {
            System.out.println("Você foi aprovado em " + disciplinas[indice]);
            System.out.println("Sua nota foi: " + notas[indice]);
        } else {
            System.out.println("Você foi reprovado em " + disciplinas[indice]);
            System.out.println("Sua nota foi: " + notas[indice]);
        }
    }

    public void informacoeDoAluno() {
        System.out.println("Informações do aluno: " + nome);
        System.out.println("Matrícula: " + matricula);
        System.out.println("Curso: " + curso);

    }
}
