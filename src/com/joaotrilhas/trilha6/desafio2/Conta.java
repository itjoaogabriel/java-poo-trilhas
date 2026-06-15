package com.joaotrilhas.trilha6.desafio2;

public class Conta {

    private String titular;
    private double saldo;

    public String getTitular() { return titular; }
    public double getSaldo() { return saldo; }

    protected void setSaldo(double novoSaldo) {
        this.saldo = novoSaldo;
    }

    public Conta(String titular, double saldo) {
        if (titular == null || titular.isEmpty()) {
            throw new IllegalArgumentException("Informe um titular.");
        }
        if (saldo < 0) {
            throw new IllegalArgumentException("Saldo não pode ser negativo.");
        }
        this.titular = titular;
        this.saldo = saldo;
    }

    public void depositar(double valor) {
        if (valor <= 0) {
            throw new IllegalArgumentException("Informe um valor válido.");
        }
        saldo += valor;
    }

    public void sacar(double valor) {
        if (saldo < valor) {
            throw new IllegalArgumentException("Saldo insuficiente.");
        }
        saldo -= valor;
    }

    public void exibir() {
        System.out.format("Titular: %s | Saldo R$%.2f%n",
                            getTitular(),
                            getSaldo());
    }
}
