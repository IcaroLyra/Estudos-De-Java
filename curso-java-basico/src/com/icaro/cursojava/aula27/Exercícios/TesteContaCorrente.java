package com.icaro.cursojava.aula27.Exercícios;

public class TesteContaCorrente {
    public static void main(String[] args) {

        // 🔧 Criando uma conta
        ContaCorrente conta = new ContaCorrente();
        conta.numeroDaConta = 12345;
        conta.saldo = 100.0;
        conta.especial = true;
        conta.limite = 200.0;

        // 💰 Consultando saldo inicial
        conta.consultarSaldo();

        // 💸 Tentando sacar 50 (saldo suficiente)
        conta.saque(50);

        // 💸 Tentando sacar 200 (usa parte do cheque especial)
        conta.saque(200);

        // 🧾 Verificando se está usando cheque especial
        if (conta.isUsandoChequeEspecial()) {
            System.out.println("⚠️ Você está usando o cheque especial!");
        } else {
            System.out.println("✅ Você está com saldo positivo.");
        }

        // 💵 Fazendo depósito
        conta.depositar(300);

        // 🔍 Verificando saldo final
        conta.consultarSaldo();
    }
}
