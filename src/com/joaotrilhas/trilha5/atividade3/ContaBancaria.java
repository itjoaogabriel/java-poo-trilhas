package com.joaotrilhas.trilha5.atividade3;

public class ContaBancaria {

    private String titular;
    private String numeroConta;
    private double saldo;

    // Construtor - titular e número obrigatórios
    public ContaBancaria(String titular, String numeroConta) {
        this.titular = titular;
        this.numeroConta = numeroConta;
        this.saldo = 0;
    }

    public String getTitular() { return titular; }
    public String getNumeroConta() { return numeroConta; }
    public double getSaldo() { return saldo; }

    public void depositar(double valor) {
        if (valor > 0) saldo += valor;
        else System.out.println("Valor inválido.");
    }

    public void sacar(double valor) {
        if (valor > 0 && valor <= saldo) saldo -= valor;
        else System.out.println("Saldo insuficiente.");
    }

    public void exibirExtrato() {
        System.out.format("Titular: %s | Conta: %s | Saldo: R$%.2f%n",
                        getTitular(),
                        getNumeroConta(),
                        getSaldo());
    }
}
