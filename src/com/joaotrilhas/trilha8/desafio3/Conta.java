package com.joaotrilhas.trilha8.desafio3;

public abstract class Conta {

    private String titular;
    private double saldo;

    public String getTitular() { return titular; }
    public double getSaldo() { return saldo; }

    protected void setSaldo(double novoSaldo) {
        this.saldo = novoSaldo;
    }

    public Conta(String titular, double saldo) {
        if (titular == null || titular.isEmpty()) {
            throw new IllegalArgumentException("Informe um nome.");
        }
        if (saldo < 0) {
            throw new IllegalArgumentException("O saldo não pode ser negativo.");
        }
        this.titular = titular;
        this.saldo = saldo;
    }

    public void depositar(double valor) {
        if (valor <= 0) {
            throw new IllegalArgumentException("O depósito não pode ser negativo.");
        }
        saldo += valor;
    }
    public abstract void sacar(double valor);

    public void exibir() {
        System.out.printf("%nTitular: %s | Saldo R$%.2f%n",
                            getTitular(),
                            getSaldo());
    }
}
