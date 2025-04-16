package com.icaro.cursojava.aula27.Exercícios;

public class ContaCorrente {
    int numeroDaConta;
    double saldo;
    boolean especial;
    double limite;


    double saque(double valorDoSaque) {
        if (saldo >= valorDoSaque) {
            saldo -= valorDoSaque;
            System.out.println("Saque realizado com sucesso.");
            System.out.println("Valor sacado: " + valorDoSaque);
            System.out.println("Saldo atual: " + saldo);
            return saldo;

        } else if (especial && saldo + limite >= valorDoSaque) {
            saldo -= valorDoSaque;
            System.out.println("Saque realizado utilizando cheque especial.");
            System.out.println("Valor sacado: " + valorDoSaque);
            System.out.println("Saldo atual: " + saldo);
            return saldo;

        } else {
            System.out.println("Saque não autorizado. Saldo insuficiente.");
            System.out.println("Tentativa de saque: " + valorDoSaque);
            System.out.println("Saldo disponível + limite: " + (saldo + limite));
            return saldo;
        }
    }


    void depositar(double valor) {
        if (valor > 0) {
            saldo += valor;
            System.out.println("Depósito realizado com sucesso.");
            System.out.println("Valor depositado: " + valor);
            System.out.println("Saldo atual: " + saldo);
        } else {
            System.out.println("Depósito não realizado. O valor deve ser maior que zero.");
        }
    }


    void consultarSaldo() {
        System.out.println("Saldo atual: " + saldo);
    }


    boolean isUsandoChequeEspecial() {
        return saldo < 0;
    }
}
