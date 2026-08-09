package com.joaotrilhas.trilha7.desafio6;

public class ContaCorrente extends Conta {

    private double limite;

    public double getLimite() { return limite; }

    public ContaCorrente(String titular, double saldo, double limite) {
        super(titular, saldo);
        if (limite < 0) {
            throw new IllegalArgumentException("O limite não pode ser negativo.");
        }
        this.limite = limite;
    }
    @Override
    public void sacar(double valor) {
        if (super.getSaldo() + limite < valor) {
            throw new IllegalArgumentException("Saldo insuficiente.");
        }
        setSaldo(getSaldo() - valor);
    }
}
