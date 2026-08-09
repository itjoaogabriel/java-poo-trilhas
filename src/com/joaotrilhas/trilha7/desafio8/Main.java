package com.joaotrilhas.trilha7.desafio8;

public class Main {
    public static void main(String[] args) {

        Forma[] formas = new Forma[4];

        formas[0] = new Circulo("branco", 4.5);
        formas[1] = new Circulo("bege", 5.5);
        formas[2] = new Retangulo("lilás", 100, 25);
        formas[3] = new Retangulo("preto", 10, 5);

        Forma maior = formas[0];

        for (Forma a:formas) {
            a.exibir();
            maior = a.maiorArea(maior);
        }
        maior.exibir();
    }
}
