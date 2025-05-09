package com.icaro.cursojava.aula43.Exercicio;

public class ContaEspecial extends ContaBancaria {
    private double limite;

    public ContaEspecial(String nomeCliente, Double saldo, String numConta, double limite) {
        super(nomeCliente, saldo, numConta);
        this.limite = limite;
    }

    @Override
    public void sacar(double valor) {
        if (valor <= (getSaldo() + limite)) {
            setSaldo(getSaldo() - valor);
        } else {
            System.out.println("Erro: Limite insuficiente para saque");
        }
    }

}
