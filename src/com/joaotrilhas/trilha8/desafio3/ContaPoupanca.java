package com.joaotrilhas.trilha8.desafio3;

public class ContaPoupanca extends Conta {

    private double taxaRendimento;

    public double getTaxaRendimento() { return taxaRendimento; }

    public ContaPoupanca(String titular, double saldo, double taxaRendimento) {
        super(titular, saldo);
        if (taxaRendimento <= 0) {
            throw new IllegalArgumentException("A taxa de rendimento não pode ser negativa.");
        }
        this.taxaRendimento = taxaRendimento;
    }
    @Override
    public void sacar(double valor) {
        if (getSaldo() < valor) {
            throw new IllegalArgumentException("Saldo insuficiente.");
        }
        setSaldo(getSaldo() - valor);
    }

    public void aplicarRendimento() {
        setSaldo(getSaldo() + (getSaldo() * (taxaRendimento / 100)));
    }
    @Override
    public void exibir() {
        super.exibir();
        System.out.printf("Taxa de rendimento: %.2f%%%n", getTaxaRendimento());
    }
}