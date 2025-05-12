package com.icaro.cursojava.aula43.Exercicio2;

public class Teste {
    public static void main(String[] args) {
        PessoaFisica[] pessoas = new PessoaFisica[6];

        pessoas[0] = new PessoaFisica("Ana", 1300.0);
        pessoas[1] = new PessoaFisica("Bruno", 1500.0);
        pessoas[2] = new PessoaFisica("Carla", 2200.0);
        pessoas[3] = new PessoaFisica("Diego", 2900.0);
        pessoas[4] = new PessoaFisica("Elisa", 3500.0);
        pessoas[5] = new PessoaFisica("Felipe", 4000.0);

        for (PessoaFisica pessoa : pessoas) {
            double imposto = pessoa.calcularImposto();
            System.out.println("Nome: " + pessoa.getNome());
            System.out.println("Renda Bruta: R$ " + pessoa.getRendaBruta());
            System.out.println("Imposto a pagar: R$ " + imposto);
            System.out.println("---------------------------");
        }
    }
}
