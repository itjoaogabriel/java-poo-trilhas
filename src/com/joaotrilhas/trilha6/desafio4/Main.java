package com.joaotrilhas.trilha6.desafio4;

public class Main {
    public static void main(String[] args) {

        ProdutoPerecivel produto1 = new ProdutoPerecivel("Suco de laranja", 1, 100, "20/07/2026");
        ProdutoPerecivel produto2 = new ProdutoPerecivel("Suco de uva", 3, 20, "20/08/2026");
        ProdutoEletronico produto3 = new ProdutoEletronico("Geladeira", 3000, 20, 24, "220V");
        ProdutoEletronico produto4 = new ProdutoEletronico("Fogão", 1000, 1000, 12, "Bivolt");

        produto1.vender(10);
        produto1.exibir();
        //produto2.vender(21);
        produto2.vender(10);
        produto2.exibir();
        produto3.vender(10);
        produto3.exibir();
        produto4.vender(999);
        produto4.exibir();
    }
}
