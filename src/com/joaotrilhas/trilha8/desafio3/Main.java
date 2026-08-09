package com.joaotrilhas.trilha8.desafio3;

public class Main {
    public static void main(String[] args) {

        Conta[] contas = new Conta[3];

        contas[0] = new ContaCorrente("João", 2000, 1000);
        contas[1] = new ContaPoupanca("Ana", 3000, 10);
        contas[2] = new ContaCorrente("Rosala", 500, 100);

        for (Conta a:contas) {
            a.depositar(1000);

            if (a instanceof ContaPoupanca c) {
                c.aplicarRendimento();
            }
        }

        for (Conta a:contas) {
            a.exibir();
        }
    }
}
