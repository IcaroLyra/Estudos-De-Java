package com.icaro.cursojava.aula43.Exercicio;

public class Teste {
    public static void main(String[] args) {

        // Criar contas
        ContaPoupanca poupanca = new ContaPoupanca("Maria", 1000.0, "1234", 15);
        ContaEspecial especial = new ContaEspecial("João", 500.0, "5678", 300.0);

        // Sacar valores
        poupanca.sacar(200.0);
        especial.sacar(700.0); // usa o limite

        // Depositar valores
        poupanca.depositar(150.0);
        especial.depositar(100.0);

        // Calcular novo saldo com rendimento
        poupanca.calcularNovoSaldo(1.5); // 1.5% de rendimento

        // Mostrar dados das contas
        System.out.println("=== Conta Poupança ===");
        System.out.println("Cliente: " + poupanca.getNomeCliente());
        System.out.println("Número da Conta: " + poupanca.getNumConta());
        System.out.println("Saldo final: " + poupanca.getSaldo());

        System.out.println("\n=== Conta Especial ===");
        System.out.println("Cliente: " + especial.getNomeCliente());
        System.out.println("Número da Conta: " + especial.getNumConta());
        System.out.println("Saldo final: " + especial.getSaldo());
    }
}
