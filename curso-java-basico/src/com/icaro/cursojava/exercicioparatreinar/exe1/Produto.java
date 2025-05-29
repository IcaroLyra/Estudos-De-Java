package com.icaro.cursojava.exercicioparatreinar.exe1;

public class Produto {
    private String nome;
    private double preco;
    private int quantidade;

    public Produto(String nome, double preco, int quantidade) {
        this.nome = nome;
        this.preco = preco;
        this.quantidade = quantidade;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public void reporEstoque(int valor){

        this.quantidade += valor;

    }

    public void vender(int valor) {
        if (valor <= this.quantidade) {
            this.quantidade -= valor;
        } else {
            System.out.println("❌ Estoque insuficiente para a venda.");
        }
    }

    public void exibirDetalhes() {
        System.out.println("Produto: " + getNome());
        System.out.printf("Preço: R$ %.2f\n", getPreco());
        System.out.println("Estoque: " + getQuantidade() +
                (getQuantidade() == 1 ? " unidade" : " unidades"));
    }

}
