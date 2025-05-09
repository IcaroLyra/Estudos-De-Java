package com.icaro.cursojava.aula43.Exercicio;

public class ContaBancaria {
    private String nomeCliente;
    private String numConta;
    private Double saldo;

    public ContaBancaria(String nomeCliente, Double saldo, String numConta) {
        this.nomeCliente = nomeCliente;
        this.saldo = saldo;
        this.numConta = numConta;
    }

    public String getNomeCliente() {
        return nomeCliente;
    }

    public void setNomeCliente(String nomeCliente) {
        this.nomeCliente = nomeCliente;
    }

    public Double getSaldo() {
        return saldo;
    }

    public void setSaldo(Double saldo) {
        this.saldo = saldo;
    }

    public String getNumConta() {
        return numConta;
    }

    public void setNumConta(String numConta) {
        this.numConta = numConta;
    }

    public void sacar(double valor) {
        if (saldo >= valor) {
            saldo -= valor;
        }else {
            System.out.println("Saldo insuficiente.");
        }
    }

    public void depositar(double valor){
        if (valor > 0){
            saldo += valor;
            System.out.println("O valor foi depositado com sucesso");
        }else{
            System.out.println("Erro:O valor tem que ser maior que zero");
        }
    }
}
