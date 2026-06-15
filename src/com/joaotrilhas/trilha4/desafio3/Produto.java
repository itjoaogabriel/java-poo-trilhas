package com.joaotrilhas.trilha4.desafio3;

public class Produto {

    private String nome;
    private double preco;
    private int estoque;
    private String categoria;

    public String getNome() { return nome; }
    public double getPreco() { return preco; }
    public int getEstoque() { return estoque; }
    public String getCategoria() { return categoria; }

    public void setNome(String nome) {
        if (nome != null && !nome.isEmpty()) {
            this.nome = nome;
        } else {
            System.out.println("O espaço de nome não pode ficar vazio..");
        }
    }

    public void setCategoria(String categoria) {
        if (categoria != null && !categoria.isEmpty()) {
            this.categoria = categoria;
        } else {
            System.out.println("O espaço de categoria não pode ficar vazio..");
        }
    }
    public void setPreco(double preco) {
        if (preco > 0) {
            this.preco = preco;
        } else {
            System.out.println("Erro. Informe um preço válido.");
        }
    }

    public void setEstoque(int estoque) {
        if (estoque > 0) {
            this.estoque = estoque;
        } else {
            System.out.println("Estoque insuficiente.");
        }
    }

    public double getPrecoComDesconto(double percentual) {
        return preco - (preco * (percentual / 100));
    }

    public boolean isDisponivel() {
        return estoque > 0;
    }

    public void vender(int quantidade) {
        if (estoque >= quantidade) {
            estoque -= quantidade;
        } else {
            System.out.println("Quantidade insuficiente em estoque.");
        }
    }
}