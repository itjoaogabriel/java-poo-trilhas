package com.joaotrilhas.trilha5.desafio4;

public class MainContaBancaria {
    public static void main(String[] args) {

        ContaBancaria conta1 = new ContaBancaria("João", "8989", 1000);
        ContaBancaria conta2 = new ContaBancaria("Nana", "8888");

        conta1.sacar(50);
        //conta1.sacar(2000);
        conta1.depositar(2000);
        conta1.sacar(2000);
        conta1.exibirExtrato();

        conta2.depositar(200);
        conta2.sacar(10);
        conta2.exibirExtrato();
    }
}