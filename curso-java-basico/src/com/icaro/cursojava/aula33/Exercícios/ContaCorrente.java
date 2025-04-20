package com.icaro.cursojava.aula33.Exercícios;

public class ContaCorrente {

    private int numero;
    private double saldo;
    private boolean statusEspecial;
    private double limite;

    public ContaCorrente(int numero, double limite, boolean statusEspecial, double saldo) {
        this.numero = numero;
        this.limite = limite;
        this.statusEspecial = statusEspecial;
        this.saldo = saldo;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public double getLimite() {
        return limite;
    }

    public void setLimite(double limite) {
        this.limite = limite;
    }

    public boolean isStatusEspecial() {
        return statusEspecial;
    }

    public void setStatusEspecial(boolean statusEspecial) {
        this.statusEspecial = statusEspecial;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public double sacar(double valor) {
        if (saldo + limite >= valor) {
            saldo -= valor;
        } else {
            System.out.println("Saldo insuficiente.");
        }
        return saldo;
    }

    public double depositar(double valor) {
        if (valor > 0) {
            saldo += valor;
        } else {
            System.out.println("Depósito inválido.");
        }
        return saldo;
    }


    public void consultarSaldo(){
        System.out.println("O seu saldo e de " + saldo);
    }

    public void consultarChequeEspecial(){
        if (statusEspecial){
            System.out.println("O seu cheque e Especial");
        }else {
            System.out.println("O seu cheque não e Especial");
        }
    }
}
