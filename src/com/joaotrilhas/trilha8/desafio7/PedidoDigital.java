package com.joaotrilhas.trilha8.desafio7;

public class PedidoDigital extends Pedido implements Pagavel {

    private double valorItens;

    public  double getValorItens() { return valorItens; }

    public PedidoDigital(String cliente, double valorItens) {
        super(cliente);
        if (valorItens <= 0) {
            throw new IllegalArgumentException("Informe o valor dos itens.");
        }

        this.valorItens = valorItens;
    }

    @Override
    public String getDescricao() { return "Pedido Digital"; }

    @Override
    public void confirmar() {
        setStatus("Confirmado - Entrega imediata.");
    }

    @Override
    public void cancelar() {
        if (getStatus().equals("cancelado")) {
            System.out.printf("Pedido do cliente %s bloqueado.%n", getCliente());
        } else {
            setStatus("cancelado");
        }
    }

    @Override
    public double calcularTotal() {
        return valorItens;
    }

    @Override
    public void exibir() {
        super.exibir();
        System.out.printf("Valor total: R$%.2f%n", calcularTotal());
    }
}
