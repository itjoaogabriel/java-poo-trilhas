package com.joaotrilhas.trilha1.desafio3;

public class ProdutoTeste {

    public static void main(String[] args) {

        Produto produto1 = new Produto();

        produto1.nome = "óculos";
        produto1.preco = 200.0;
        produto1.estoque = 2;

        produto1.vender(3);

        Produto produto2 = new Produto();

        produto2.nome = "Roupa";
        produto2.preco = 300.0;
        produto2.estoque = 26;

        produto2.vender(2);

        produto1.exibirEstoque();
        produto2.exibirEstoque();
    }
}
