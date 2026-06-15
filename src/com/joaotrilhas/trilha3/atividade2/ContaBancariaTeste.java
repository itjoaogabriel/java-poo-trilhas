package com.joaotrilhas.trilha3.atividade2;

public class ContaBancariaTeste {

    static void main(String[] args) {

        ContaBancaria conta = new ContaBancaria();

        conta.setTitular("João");
        conta.depositar(1000.0);
        conta.depositar(-50.0); //inválido
        conta.sacar(200.0);
        conta.sacar(2000.0); // saldo insuficiente
        conta.exibirSaldo();
    }
}
