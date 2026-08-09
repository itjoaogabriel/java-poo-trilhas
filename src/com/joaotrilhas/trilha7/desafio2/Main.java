package com.joaotrilhas.trilha7.desafio2;

public class Main {
    public static void main(String[] args) {

        Forma[] formas = new Forma[3];

        formas[0] = new Retangulo("Branco", 10,5);
        formas[1] = new Circulo("Bege", 10.5);
        formas[2] = new Retangulo("Preto", 20,10);

        for(Forma a : formas) {
            a.exibir();
            if (a instanceof Circulo c) {
                System.out.format("Diâmetro: %.2f%n", c.calcularDiametro());
            }
        }
    }
}
