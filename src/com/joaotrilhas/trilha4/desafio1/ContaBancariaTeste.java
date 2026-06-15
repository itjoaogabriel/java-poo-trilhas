package com.joaotrilhas.trilha4.desafio1;

public class ContaBancariaTeste {
    public static void main(String[] args) {

        ContaBancaria conta = new ContaBancaria();

        conta.setTitular("João");
        conta.setNumeroConta("89226100");
        //conta.setSaldo(2000.0);
        conta.sacar(100);
        conta.depositar(1000);
        conta.sacar(500);
        conta.exibir();
    }
}
