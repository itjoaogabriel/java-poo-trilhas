package com.joaotrilhas.trilha4.desafio8;

public class PedidoTeste {
    public static void main(String[] args) {

        Pedido pedido = new Pedido();

        pedido.setCliente("João");
        pedido.setValorTotal(2000);
        pedido.setStatus("pendente");
        pedido.aplicarDesconto(10);
        pedido.confirmar();
        pedido.exibir();

        Pedido pedido1 = new Pedido();

        pedido1.setCliente("Ana");
        pedido1.setValorTotal(1000);
        pedido1.setStatus("cancelado");
        pedido1.aplicarDesconto(100);
        pedido1.confirmar();
        pedido1.exibir();

        Pedido pedido2 = new Pedido();

        pedido2.setCliente("Pablo");
        pedido2.setValorTotal(5000);
        pedido2.setStatus("pendente");
        pedido2.aplicarDesconto(30);
        pedido2.confirmar();
        pedido2.cancelar();
        pedido2.exibir();
    }
}