package com.joaotrilhas.trilha3.atividade2;

public class ContaBancaria {

    private String titular;
    private double saldo;

    public void setTitular(String titular) {
        this.titular = titular;
    }

    public void depositar(double valor) {
        if (valor > 0) {
            saldo += valor;
            System.out.format("Depósito de R$%.2f realizado.%n", valor);
        } else {
            System.out.println("Valor inválido para depósito.");
        }
    }

    public void sacar(double valor) {
        if (valor > 0 && valor <= saldo) {
            saldo -= valor;
            System.out.format("Saque de R$%.2f realizado.%n", valor);
        } else {
            System.out.println("Saldo insuficiente ou valor inválido.");
        }
    }

    public void exibirSaldo() {
        System.out.format("Titular: %s | Saldo: R$%.2f%n", titular, saldo);
    }
}
