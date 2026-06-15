package com.joaotrilhas.trilha1.atividade3;

public class ContaBancariaTeste {

    public static void main(String[] args) {

        ContaBancaria conta = new ContaBancaria();

        conta.titular = "João";
        conta.saldo = 0;

        conta.depositar(500.0);
        conta.depositar(250.0);

        conta.exibirSaldo();
    }
}
