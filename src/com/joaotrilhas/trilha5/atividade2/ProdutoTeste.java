package com.joaotrilhas.trilha5.atividade2;

public class ProdutoTeste {
    public static void main(String[] args) {

        Produto p1 = new Produto("Notebook", 3500.0, 10);
        Produto p2 = new Produto("Mouse", 150.0);
        p1.exibir();
        p2.exibir();
    }
}
