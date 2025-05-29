package com.icaro.cursojava.exercicioparatreinar.exe1;

public class Main {
    public static void main(String[] args) {

        // Criando dois produtos
        Produto caneta = new Produto("Caneta", 2.50, 40);
        Produto caderno = new Produto("Caderno", 15.00, 20);

        // Repondo estoque da caneta
        caneta.reporEstoque(10); // agora tem 50

        // Vendendo 2 cadernos
        caderno.vender(2); // agora tem 18

        // Exibindo detalhes dos dois
        System.out.println("📦 Detalhes dos Produtos:\n");

        caneta.exibirDetalhes();
        System.out.println();
        caderno.exibirDetalhes();
    }
}
