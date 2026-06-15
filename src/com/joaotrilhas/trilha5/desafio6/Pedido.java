package com.joaotrilhas.trilha5.desafio6;

public class Pedido {

    private String cliente;
    private String status;
    private double valorTotal;
    private double desconto;

    public String getCliente() { return cliente; }
    public String getStatus() { return status; }
    public double getValorTotal() { return valorTotal; }
    public double getDesconto() { return desconto; }

    public Pedido(String cliente, double valorTotal) {
        if (cliente == null || cliente.isEmpty()) {
            throw new IllegalArgumentException("Preencha o campo cliente.");
        }
        if (valorTotal <= 0) {
            throw new IllegalArgumentException("O valor total não pode ser negativo.");
        }
        this.cliente = cliente;
        this.valorTotal = valorTotal;
        status = "pendente";
    }

    public void confirmar() {
        if (status.equals("pendente")) {
            status = "confirmado";
        }
    }

    public void cancelar() {
        if (status.equals("pendente") || status.equals("confirmado")) {
            status = "cancelado";
        }
    }

    public void aplicarDesconto(double percentual) {
        if (percentual < 0 || percentual > 30) {
            throw new IllegalArgumentException("Percentual de desconto excede o limite permitido.");
        }
        if (status.equals("cancelado")) {
            throw new IllegalArgumentException("Bloqueio. O pedido já está cancelado.");
        }
        desconto = valorTotal * (percentual / 100);
    }

    public double getValorComDesconto() {
        return valorTotal - desconto;
    }

    public void exibir() {
        System.out.format("Cliente: %s | Status: %s | Valor total R$%.2f | Desconto R$%.2f%n" +
                        "Valor final com desconto R$%.2f%n",
                            getCliente(),
                            getStatus(),
                            getValorTotal(),
                            getDesconto(),
                            getValorComDesconto());
    }
}