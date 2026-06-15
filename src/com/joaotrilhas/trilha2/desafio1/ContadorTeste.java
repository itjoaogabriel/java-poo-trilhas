package com.joaotrilhas.trilha2.desafio1;

public class ContadorTeste {

    public static void main(String[] args) {

        Contador cont = new Contador();

        for (int i = 0; i < 5; i++) {
            cont.incrementar();
        }
        cont.decrementar();
        cont.decrementar();

        cont.exibir();
        cont.resetar();
        cont.exibir();
    }
}
