package com.joaotrilhas.trilha2.validacao;

public class ContaCorrenteTeste {

    public static void main(String[] args) {

        ContaCorrente conta1 = new ContaCorrente();
        ContaCorrente conta2 = new ContaCorrente();

        conta1.titular = "João";
        conta1.limite = 500;
        conta1.saldo = 100;

        conta2.titular = "Ana";
        conta2.limite = 400;
        conta2.saldo = 1000;

        conta1.saque(1000);
        conta2.saque(100);

        conta1.exibir();
        conta2.exibir();
    }
}
