package com.joaotrilhas.trilha7.desafio9;

public class Pagamento {

    private double valor;
    private String status;

    public double getValor() { return valor; }
    public String getStatus() { return status; }

    public Pagamento(double valor) {
        if (valor < 0) {
            throw new IllegalArgumentException("O valor não pode ser negativo.");
        }
        this.valor = valor;
        status = "pendente";
    }

    public void processar() {
        status = "aprovado";
        System.out.format("%nPagamento aprovado.%nValor R$%.2f%n", getValor());
    }
}