package com.joaotrilhas.trilha8.desafio4;

public class ProdutoFisico implements Tributavel {

    private String nome;
    private double preco;

    public String getNome() { return nome; }
    public double getPreco() { return preco; }

    public ProdutoFisico(String nome, double preco) {
        if (nome == null || nome.isEmpty()) {
            throw new IllegalArgumentException("Informe um nome.");
        }
        if (preco < 0) {
            throw new IllegalArgumentException("O preco não pode ser negativo.");
        }
        this.nome = nome;
        this.preco = preco;
    }

    @Override
    public double calcularImposto() {
        return preco * 0.12;
    }
}