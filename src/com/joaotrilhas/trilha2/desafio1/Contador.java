package com.joaotrilhas.trilha2.desafio1;

public class Contador {

    int valor;

    void incrementar() {
        valor++;
    }

    void decrementar() {
        valor--;
    }

    void resetar() {
        valor = 0;
    }

    void exibir() {
        System.out.println("Valor atual: " + valor);
    }
}