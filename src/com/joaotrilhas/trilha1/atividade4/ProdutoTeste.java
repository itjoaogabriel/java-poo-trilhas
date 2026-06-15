package com.joaotrilhas.trilha1.atividade4;

public class ProdutoTeste {
    public static void main(String[] args) {

        Produto produto1 = new Produto();

        produto1.nome = "Notebook";
        produto1.preco = 3500.0;
        produto1.quantidade = 2;

        Produto produto2 = new Produto();

        produto2.nome = "Tablet";
        produto2.preco = 1500.0;
        produto2.quantidade = 13;

        produto1.exibir();
        produto2.exibir();
    }
}
