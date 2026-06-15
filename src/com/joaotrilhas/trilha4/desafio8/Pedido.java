package com.joaotrilhas.trilha4.desafio8;

public class Pedido {

    private String cliente;
    private double valorTotal;
    private double desconto;
    private String status;

    public String getCliente() { return cliente; }
    public String getStatus() { return status; }
    public double getValorTotal() { return valorTotal; }
    public double getDesconto() { return desconto; }

    public void setCliente(String cliente) {
        if (cliente != null && !cliente.isEmpty()) {
            this.cliente = cliente;
        } else {
            System.out.println("Preencha o espaço cliente.");
        }
    }

    public void setValorTotal(double valorTotal) {
        if (valorTotal > 0) {
            this.valorTotal = valorTotal;
        } else {
            System.out.println("O valor total não pode ser negativo, informe um valor válido.");
        }
    }

    public void setStatus (String status) {
        if (status.equals("pendente") || status.equals("confirmado") || status.equals("cancelado")) {
            this.status = status;
        } else {
            System.out.println("Status inválido.");
        }
    }

    public void aplicarDesconto(double percentual) {
        if (percentual > 0 && percentual <= 30) {
            desconto = valorTotal * (percentual / 100);
        } else {
            System.out.println("Percentual de desconto excedeu o limite permitido de 30%.");
        }
    }

    public double getValorComDesconto() {
        return valorTotal - desconto;
    }

    public void cancelar() {
        if (!status.equals("cancelado")) {
            status = "cancelado";
        } else {
            System.out.println("O pedido já está cancelado.");
        }
    }

    public void confirmar() {
        if (!status.equals("cancelado")) {
            status = "confirmado";
        } else {
            System.out.println("Não é possível confirmar um pedido cancelado.");
        }
    }

    public void exibir() {
        System.out.format("Cliente: %s | Valor total R$%.2f | Desconto R$%.2f%n",
                        getCliente(), getValorTotal(), getDesconto());
        System.out.format("Valor total com desconto R$%.2f%n", getValorComDesconto());
        System.out.println("Status pedido: " + getStatus());
        System.out.println();
    }
}
