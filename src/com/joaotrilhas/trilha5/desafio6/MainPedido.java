package com.joaotrilhas.trilha5.desafio6;

public class MainPedido {
    public static void main(String[] args) {

        Pedido pedido1 = new Pedido("João", 1000);
        Pedido pedido2 = new Pedido("Ana", 2000);
        Pedido pedido3 = new Pedido("Laura", 500);

        pedido1.aplicarDesconto(10);
        pedido1.confirmar();
        pedido1.exibir();

        //pedido2.aplicarDesconto(-1);
        pedido2.aplicarDesconto(3);
        pedido2.confirmar();
        pedido2.cancelar();
        pedido2.exibir();

        pedido3.confirmar();
        pedido3.confirmar();
        pedido3.exibir();
    }
}
