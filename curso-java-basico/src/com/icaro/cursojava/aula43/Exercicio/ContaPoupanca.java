package com.icaro.cursojava.aula43.Exercicio;

public class ContaPoupanca extends ContaBancaria{

    private int diaRendimento;

    public ContaPoupanca(String nomeCliente, Double saldo, String numConta, int diaRendimento) {
        super(nomeCliente, saldo, numConta);
        this.diaRendimento = diaRendimento;
    }

   public void calcularNovoSaldo(double taxaRendimento){
        if (taxaRendimento > 0){
            double rendimento = getSaldo() * (taxaRendimento / 100);
            setSaldo(getSaldo() + rendimento);
            System.out.printf("Novo saldo com rendimento: %.2f\n", getSaldo());

        }
   }
}
