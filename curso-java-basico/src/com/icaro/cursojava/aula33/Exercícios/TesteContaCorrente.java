package com.icaro.cursojava.aula33.Exercícios;

public class TesteContaCorrente {
    public static void main(String[] args) {
        ContaCorrente conta = new ContaCorrente(12345, 500.00, true, 1000.00);

        conta.consultarSaldo();
        conta.consultarChequeEspecial();

        System.out.println("\nTentando sacar R$ 1200...");
        conta.sacar(1200);
        conta.consultarSaldo();

        System.out.println("\nDepositando R$ 300...");
        conta.depositar(300);
        conta.consultarSaldo();

        System.out.println("\nTentando sacar R$ 2000 (acima do limite)...");
        conta.sacar(2000);
        conta.consultarSaldo();
    }
}
