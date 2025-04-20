package com.icaro.cursojava.aula33;

public class Aluno {
    private String nome;
    private int matricula;
    private String curso;
    private String[] diciplinas;
    private double[] notas;

    public Aluno(String nome, double[] notas, String[] diciplinas, String curso, int matricula) {
        this.nome = nome;
        this.notas = notas;
        this.diciplinas = diciplinas;
        this.curso = curso;
        this.matricula = matricula;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getMatricula() {
        return matricula;
    }

    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }

    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }

    public String[] getDiciplinas() {
        return diciplinas;
    }

    public void setDiciplinas(String[] diciplinas) {
        this.diciplinas = diciplinas;
    }

    public double[] getNotas() {
        return notas;
    }

    public void setNotas(double[] notas) {
        this.notas = notas;
    }

    public void verificarAprovacao() {
        for (int i = 0; i < notas.length; i++) {
            String disciplina = diciplinas[i];
            double nota = notas[i];

            if (nota >= 7) {
                System.out.println("Disciplina " + disciplina + ": Aprovado com nota " + nota);
            } else {
                System.out.println("Disciplina " + disciplina + ": Reprovado com nota " + nota);
            }
        }
    }


}
