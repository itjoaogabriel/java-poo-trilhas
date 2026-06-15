package com.joaotrilhas.trilha6.desafio2;

public class ContaPoupanca extends Conta {

    private double taxaRendimento;

    public double getTaxaRendimento() { return taxaRendimento; }

    public ContaPoupanca(String titular, double saldo, double taxaRendimento) {
        super(titular, saldo);
        if (taxaRendimento <= 0 || taxaRendimento > 20) {
            throw new IllegalArgumentException("Taxa de rendimento não pode ser negativa.");
        }
        this.taxaRendimento = taxaRendimento;
    }

    public void aplicarRendimento() {
        setSaldo(getSaldo()  + getSaldo() * (taxaRendimento / 100));
    }

    @Override
    public void exibir() {
        super.exibir();
        System.out.format("Taxa de rendimento: %.2f%%%n", getTaxaRendimento());
    }
}
