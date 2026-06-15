package com.joaotrilhas.trilha4.desafio3;

public class ProdutoTeste {

    public static void main(String[] args) {

        Produto produto = new Produto();

        produto.setNome("Celular");
        produto.setPreco(1000.00);
        produto.setCategoria("Telefonia");
        produto.setEstoque(2);

        produto.vender(2);
        produto.vender(2);

        Produto produto1 = new Produto();

        produto1.setNome("Tablet");
        produto1.setPreco(1000.00);
        produto1.setCategoria("Telefonia");
        produto1.setEstoque(6);
        produto1.getPrecoComDesconto(10);

        produto1.vender(2);
        produto1.vender(2);

        System.out.format("Produto: %s | Categoria: %s | Preço R$%.2f | Estoque: %d%n" +
                "Produto disponível? %b%n%n", produto.getNome(), produto.getCategoria(), produto.getPreco(), produto.getEstoque(),
                produto.isDisponivel());

        System.out.format("Produto: %s | Categoria: %s | Preço R$%.2f | Estoque: %d%n" +
                        "Produto disponível? %b%n", produto1.getNome(), produto1.getCategoria(), produto1.getPreco(), produto1.getEstoque(),
                produto1.isDisponivel());
        System.out.println("Preço com desconto R$" + produto1.getPrecoComDesconto(10));
    }
}
