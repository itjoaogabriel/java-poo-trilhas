package com.joaotrilhas.trilha2.desafio2;

public class Caixa {

    double saldo;

    void registrarVenda (double valor) {
        saldo = saldo + valor;
    }

    void registrarDespesa (double valor) {
        if (saldo >= valor) {
            saldo = saldo - valor;
        } else {
            System.out.println("Saldo insuficiente.");
        }
    }

    void fecharCaixa() {
        System.out.format("Saldo final do dia R$%.2f%n", saldo);
    }
}
