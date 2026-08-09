package com.joaotrilhas.trilha6.desafio4;

public class Produto {

    private String nome;
    private double preco;
    private int estoque;

    public String getNome() { return nome; }
    public double getPreco() { return preco; }
    public int getEstoque() { return estoque; }

    public Produto(String nome, double preco, int estoque) {
        if (nome == null || nome.isEmpty()) {
            throw new IllegalArgumentException("Informe um nome.");
        }
        if (preco < 0) {
            throw new IllegalArgumentException("Preço não pode ser negativo..");
        }
        if (estoque < 0) {
            throw new IllegalArgumentException("Estoque não pode ser negativo.");
        }
        this.nome = nome;
        this.preco = preco;
        this.estoque = estoque;
    }

    public void vender(int quantidade) {
        if (estoque >= quantidade) {
            estoque -= quantidade;
        } else {
            throw new IllegalArgumentException("Estoque insuficiente.");
        }
    }

    public void exibir() {
        System.out.format("Produto: %s | Preço R$%.2f | Estoque: %d%n",
                            getNome(),
                            getPreco(),
                            getEstoque());
    }
}
