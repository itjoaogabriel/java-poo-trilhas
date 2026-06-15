package com.joaotrilhas.trilha4.desafio6;

public class EstoqueTeste {
    public static void main(String[] args) {

        Estoque estoque = new Estoque();

        estoque.setMinimo(0);
        estoque.setProduto("Livros");
        estoque.setQuantidade(5);

        estoque.adicionar(-1);
        estoque.adicionar(2);
        estoque.adicionar(4);
        estoque.remover(5);
        estoque.remover(20);
        estoque.adicionar(20);
        estoque.exibirStatus();
    }
}
