package com.joaotrilhas.trilha5.desafio2;

public class ProdutoMain {
    public static void main(String[] args) {

        Produto produto1 = new Produto("Celular", "Telefonia", 2000.0, 2);
        produto1.vender(3);
        produto1.isDisponivel();
        System.out.format("Nome: %s | Categoria: %s | Preço R$%.2f | Quantidade em estoque: %d%n" +
                        "Situação: %s%n", produto1.getNome(), produto1.getCategoria(), produto1.getPreco(),
                        produto1.getEstoque(), produto1.isDisponivel() ? "Em estoque" : "Fora de estoque");

        Produto produto2 = new Produto("Tablet", 1000.0);
        produto2.vender(2);
        produto2.isDisponivel();
        System.out.format("%nNome: %s | Preço R$%.2f%n", produto2.getNome(), produto2.getPreco());
    }
}
