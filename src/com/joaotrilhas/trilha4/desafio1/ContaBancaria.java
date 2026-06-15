package com.joaotrilhas.trilha4.desafio1;

public class ContaBancaria {

    private String titular;
    private String numeroConta;
    private double saldo;

    public String getTitular() { return titular; }
    public String getNumeroConta() { return numeroConta; }
    public double getSaldo() { return saldo; }

    public void setTitular(String titular) {
        if (titular != null && !titular.isEmpty()) {
            this.titular = titular;
        } else {
            System.out.println("Erro. Informe o titular.");
        }
    }

    public void setNumeroConta(String numeroConta) {
        if (numeroConta != null && !numeroConta.isEmpty()) {
            this.numeroConta = numeroConta;
        } else {
            System.out.println("Erro. Informe o número da conta.");
        }
    }

    public void depositar(double valor) {
        if (valor > 0) {
            saldo += valor;
        } else {
            System.out.println("Não é possível depositar um valor negativo.");
        }
    }

    public void sacar(double valor) {
        if (saldo >= valor) {
            saldo -= valor;
        } else {
            System.out.println("Valor insuficiente.");
        }
    }

    public void exibir() {
        System.out.format("Titular: %s | Número da conta: %s | Saldo R$%.2f",
                getTitular(), getNumeroConta(), getSaldo());
    }
}
