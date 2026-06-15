package com.joaotrilhas.trilha1.atividade4;
/*
Crie uma classe Produto com os atributos nome (String), preco (double) e quantidade (int).
Adicione um método double calcularTotal() que retorne o valor total (preco * quantidade) e um
método void exibir() que imprima todos os dados do produto incluindo o total calculado.
 */
public class Produto {

    String nome;
    double preco;
    int quantidade;

    double calcularTotal() {
        return preco * quantidade;
    }

    void exibir() {
        System.out.println("Produto: " + nome);
        System.out.format("Preço unitário: %.2f%n", preco);
        System.out.println("Quantidade: " + quantidade);
        System.out.println("Total: R$ " + calcularTotal());
        System.out.println();
    }
}
