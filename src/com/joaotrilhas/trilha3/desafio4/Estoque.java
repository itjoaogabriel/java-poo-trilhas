package com.joaotrilhas.trilha3.desafio4;

public class Estoque {

    private int quantidade;

    public void adicionar(int quantidade) {
        if (quantidade > 0) {
            this.quantidade += quantidade;
        } else {
            System.out.println("Quantidade informada inválida.");
        }
    }

    public void remover(int quantidade) {
        if (this.quantidade >= quantidade) {
            this.quantidade -= quantidade;
        } else {
            System.out.println("Estoque insuficiente.");
        }
    }

     public int getQuantidade() {
        return quantidade;
    }

    public void exibirQuantidade() {
        System.out.println("Quantidade em estoque: " + getQuantidade());
    }

    public boolean estoqueVazio() {
        return quantidade == 0;
    }
}
