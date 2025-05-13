package com.icaro.cursojava.aula43.Exercicio3;

public class Teste {
    public static void main(String[] args) {
        final double VALOR_BASE = 4.40;

        Passageiro[] passageiros = new Passageiro[6];
        passageiros[0] = new Estudante("Lucas", "RG", "12345", "IFES");
        passageiros[1] = new Estudante("Carla", "CPF", "67890", "UFES");
        passageiros[2] = new Idoso("Dona Maria", "CPF", "54321");
        passageiros[3] = new Idoso("Seu João", "RG", "11223");
        passageiros[4] = new Trabalhador("João", "CPF", "98765");
        passageiros[5] = new Trabalhador("Paula", "RG", "44556");

        System.out.println("---- TARIFAS ----");
        for (Passageiro p : passageiros) {
            double tarifa = p.calcularTarifa(VALOR_BASE);
            System.out.printf("Nome: %-12s | Tipo: %-11s | Tarifa: R$ %.2f%n",
                    p.getNome(), p.getClass().getSimpleName(), tarifa);
        }

    }
}
