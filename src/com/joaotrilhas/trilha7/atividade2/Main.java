package com.joaotrilhas.trilha7.atividade2;
//instanceof e downcasting com pattern matching
public class Main {
    public static void main(String[] args) {

        Forma[] formas = new Forma[2];
        formas[0] = new Circulo("Azul", 5);
        formas[1] = new Retangulo("Verde", 4, 6);

        for (Forma f : formas) {
            System.out.format("Área: %.2f%n", f.calcularArea());
            if (f instanceof Circulo c) {
                System.out.format("Diâmetro: %.2f%n", c.calcularDiametro());
            }
        }
    }
}
