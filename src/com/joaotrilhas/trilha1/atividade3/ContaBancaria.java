package com.joaotrilhas.trilha1.atividade3;
/*
Crie uma classe ContaBancaria com os atributos titular (String) e saldo (double). Crie dois
métodos: void depositar(double valor) que soma o valor ao saldo, e void exibirSaldo() que mostra
o saldo atual. No Main, instancie uma conta, faça dois depósitos e exiba o saldo ao final.
 */
public class ContaBancaria {

    String titular;
    double saldo;

    void depositar(double valor) {
        saldo = saldo + valor;
    }

    void exibirSaldo() {
        System.out.format("Titular: %s | Saldo: R$ %.2f", titular, saldo);
    }
}
