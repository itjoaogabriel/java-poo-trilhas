package com.joaotrilhas.trilha5.atividade3;

public class ContaBancariaTeste {

    public static void main(String[] args) {

        ContaBancaria c = new ContaBancaria("João", "89226100");

        c.depositar(1000.0);
        c.sacar(200.0);
        c.exibirExtrato();
    }
}
