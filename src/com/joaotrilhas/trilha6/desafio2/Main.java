package com.joaotrilhas.trilha6.desafio2;

public class Main {
    public static void main(String[] args) {

        ContaCorrente conta1 = new ContaCorrente("João", 0, 500);
        ContaPoupanca conta2 = new ContaPoupanca("Ana", 500, 4.5);

        //conta1.sacar(1000);
        conta1.sacar(500);
        //conta2.sacar(600);
        conta2.sacar(400);
        conta1.depositar(1000);
        //conta1.depositar(0);
        conta2.aplicarRendimento();
        conta1.exibir();
        conta2.exibir();
    }
}
