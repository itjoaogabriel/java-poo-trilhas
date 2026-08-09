package com.joaotrilhas.trilha8.desafio8;

public class Main {
    public static void main(String[] args) {

        Forma[] formas = new Forma[3];

        formas[0] = new Circulo("Branco", 20);
        formas[1] = new Quadrado("Preto", 20);
        formas[2] = new Triangulo("Lilás", 20, 10, 10, 10, 10);

        for (Forma f : formas) {
            f.exibir();
        }

        for (Forma f : formas) {
            if (f instanceof Redimensionavel r) {
                r.redimensionar(2.0);
            }
        }

        for (Forma f : formas) {
            f.exibir();
        }
    }
}
