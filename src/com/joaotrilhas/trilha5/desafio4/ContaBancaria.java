package com.joaotrilhas.trilha5.desafio4;

public class ContaBancaria {

    private String titular;
    private String numeroConta;
    private double saldo;

    public String getTitular() { return titular; }
    public String getNumeroConta() { return numeroConta; }
    public double getSaldo() { return saldo; }

    public ContaBancaria(String titular, String numeroConta, double saldo) {
        if (titular == null || titular.isEmpty()) {
            throw new IllegalArgumentException("Titular não pode ser vazio.");
        }
        if (numeroConta == null || numeroConta.isEmpty()) {
            throw new IllegalArgumentException("Número da conta não pode ser vazio.");
        }
        if (saldo < 0) {
            throw new IllegalArgumentException("O saldo da conta não pode ser negativo.");
        }
        this.titular = titular;
        this.numeroConta = numeroConta;
        this.saldo = saldo;
    }

    public ContaBancaria(String titular, String numeroConta) {
        this(titular,numeroConta, 0);
    }

    public void depositar(double valor) {
        if (valor <= 0) {
            throw new IllegalArgumentException("O depósito não pode ser negativo.");
        }
        saldo += valor;
    }

    public void sacar(double valor) {
        if (valor > saldo) {
            throw new IllegalArgumentException("Saldo insuficiente em conta.");
        }
        saldo -= valor;
    }

    public void exibirExtrato() {
        System.out.format("Titular: %s | Número da conta: %s | Saldo R$%.2f%n%n",
                            getTitular(),
                            getNumeroConta(),
                            getSaldo());
    }
}
