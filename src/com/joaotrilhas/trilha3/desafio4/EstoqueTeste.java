package com.joaotrilhas.trilha3.desafio4;

public class EstoqueTeste {

    public static void main(String[] args) {

        Estoque estoque = new Estoque();

        estoque.adicionar(10);
        estoque.adicionar(100);
        estoque.adicionar(20);
        estoque.adicionar(15);
        estoque.remover(20);
        estoque.remover(2);
        estoque.remover(123);
        estoque.exibirQuantidade();
        System.out.println("Estoque vazio: " + estoque.estoqueVazio());
    }
}
