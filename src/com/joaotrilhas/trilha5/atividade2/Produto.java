package com.joaotrilhas.trilha5.atividade2;

public class Produto {

    private String nome;
    private double preco;
    private int estoque;

    // Construtor completo - o principal
    public Produto(String nome, double preco, int estoque) {
        this.nome = nome;
        this.preco = preco;
        this.estoque = estoque;
    }

    // Construtor simplificado - delega com this()
    public Produto(String nome, double preco) {
        this(nome, preco, 0);
    }

    public String getNome() { return nome; }
    public double getPreco() { return preco; }
    public int getEstoque() { return estoque; }

    public void exibir() {
        System.out.format("Produto: %s | Preço: R$%.2f | Estoque: %d%n",
                            getNome(),
                            getPreco(),
                            getEstoque());
    }
}
