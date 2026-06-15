package com.joaotrilhas.trilha2.validacao;

public class ContaCorrente {

    double saldo;
    double limite;
    String titular;

    void saque(double sacar) {
        if (saldo + limite >= sacar) {
            saldo = saldo - sacar;
        } else {
            System.out.format("Saldo cliente %s insuficiente.%n", titular);
        }
    }

    void exibir() {
        System.out.format("Titular: %s | Limite R$%.2f | Saldo R$%.2f%n", titular, limite, saldo);
    }
}
