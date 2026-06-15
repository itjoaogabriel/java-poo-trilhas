package com.joaotrilhas.trilha4.desafio6;

public class Estoque {

    private String produto;
    private int quantidade;
    private int minimo;

    public String getProduto() { return produto; }
    public int getQuantidade() { return quantidade; }
    public int getMinimo() { return minimo; }
    public boolean isAbaixoDoMinimo() { return quantidade < minimo; }

    public void setProduto(String produto) {
        if (produto != null && !produto.isEmpty()) {
            this.produto = produto;
        } else {
            System.out.println("O espaço produto não pode ficar vazio.");
        }
    }

    public void setQuantidade(int quantidade) {
        if (quantidade > 0) {
            this.quantidade = quantidade;
        } else {
            System.out.println("O valor informado não pode ser menor que a quantidade em estoque.");
        }
    }

    public void setMinimo(int minimo) {
        if (minimo >= 0) {
            this.minimo = minimo;
        } else {
            System.out.println("O valor informado não pode ser negativo.");
        }
    }

    public void adicionar(int quantidade) {
        if (quantidade > 0) {
            this.quantidade += quantidade;
        } else {
            System.out.println("Erro. Informe um valor válido.");
        }
    }

    public void remover(int quantidade) {
        if (this.quantidade >= quantidade) {
            this.quantidade -= quantidade;
        } else {
            System.out.println("Quantidade insuficiente em estoque.");
        }
    }

    public void exibirStatus() {
        System.out.format("Produto: %s | Estoque: %d | Mínimo em estoque: %d%n" +
                        "Situação estoque: %s%n", getProduto(),
                getQuantidade(), getMinimo(), isAbaixoDoMinimo() ? "Abaixo do Mínimo!" : "Estoque ok.");
    }
}
