package com.joaotrilhas.trilha7.desafio6;

public class ContaPoupanca extends Conta {

    private double taxaRendimento;

    public double getTaxaRendimento() { return taxaRendimento; }

    public ContaPoupanca(String titular, double saldo, double taxaRendimento) {
        super(titular, saldo);
        if (taxaRendimento <= 0) {
            throw new IllegalArgumentException("O limite não pode ser negativo.");
        }
        this.taxaRendimento = taxaRendimento;
    }

    public void aplicarRendimento() {
        setSaldo(getSaldo() + (getSaldo() * (taxaRendimento / 100)));
    }
}