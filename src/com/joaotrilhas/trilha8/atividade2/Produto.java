package com.joaotrilhas.trilha8.atividade2;

public class Produto implements Tribunavel {

    private String nome;
    private double preco;

    public Produto(String nome, double preco) {
        this.nome = nome;
        this.preco = preco;
    }
    @Override
    public double calcularImposto() { return preco * 0.10; }
    public String getNome() { return nome; }
    public double getPreco() { return preco; }
}
