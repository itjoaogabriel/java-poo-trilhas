package com.joaotrilhas.trilha2.desafio9;

public class PedidoTeste {

        public static void main(String[] args) {

        Pedido pedido1 = new Pedido();
        Pedido pedido2 = new Pedido();

        pedido1.cliente = "João";
        pedido1.valorItens = 100;
        pedido1.taxaEntrega = 10;
        pedido1.desconto = 10;

        pedido2.cliente = "Ana";
        pedido2.valorItens = 20;
        pedido2.taxaEntrega = 5;
        pedido2.desconto = 0;

        pedido1.aplicarCupom(10);

        pedido1.exibirResumo();
        pedido2.exibirResumo();
    }
}
