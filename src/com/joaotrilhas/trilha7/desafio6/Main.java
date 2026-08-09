package com.joaotrilhas.trilha7.desafio6;

public class Main {
    public static void main(String[] args) {

        Conta[] contas = new Conta[3];

        contas[0] = new ContaCorrente("João", 2000, 1000);
        contas[1] = new ContaPoupanca("Ana", 3000, 10);
        contas[2] = new ContaCorrente("Rosala", 500, 100);

        for (Conta a:contas) {
            a.depositar(100);

            if (a instanceof ContaPoupanca c) {
                c.aplicarRendimento();
            }
        }

        contas[0].sacar(200);
        //contas[1].sacar(5000);
        contas[1].sacar(300);
        //contas[2].depositar(-1);
        contas[2].depositar(3000);

        for (Conta a:contas) {
            a.exibir();
        }
    }
}
