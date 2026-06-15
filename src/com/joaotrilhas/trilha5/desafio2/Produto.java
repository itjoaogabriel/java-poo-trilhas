package com.joaotrilhas.trilha5.desafio2;

public class Produto {

    private String nome;
    private double preco;
    private int estoque;
    private String categoria;

    public String getNome() { return nome; }
    public String getCategoria() { return categoria; }
    public int getEstoque() { return estoque; }
    public double getPreco() { return preco; }

    public Produto(String nome, String categoria, double preco, int estoque) {
        this.nome = nome;
        this.categoria = categoria;
        this.estoque = estoque;
        this.preco = preco;
    }

    public Produto(String nome, double preco) {
        this(nome,"Geral", preco, 0);
    }

    public boolean isDisponivel() {
        return estoque > 0;
    }

    public void vender(int quantidade) {
        if (estoque >= quantidade) {
            estoque -= quantidade;
        } else {
            System.out.println("Estoque insuficiente.");
        }
    }
}