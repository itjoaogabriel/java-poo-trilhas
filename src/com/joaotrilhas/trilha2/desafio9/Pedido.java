package com.joaotrilhas.trilha2.desafio9;

public class Pedido {

    String cliente;
    double valorItens;
    double taxaEntrega;
    double desconto;

    void aplicarCupom(double percentual) {
        desconto = valorItens * (percentual / 100);
    }

    double calcularTotal() {
        return  (valorItens - desconto) + taxaEntrega;
    }

    void exibirResumo () {
        System.out.format("Cliente: %s%nValor do pedido R$ %.2f " +
                "| Taxa de entrega R$%.2f | Desconto R$%.2f", cliente, valorItens,
                taxaEntrega, desconto);
        System.out.format("%nValor Total R$%.2f", calcularTotal());
    }
}
