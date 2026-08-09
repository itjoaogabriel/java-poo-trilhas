package com.joaotrilhas.trilha6.desafio6;

public class Main {
    public static void main(String[] args) {

        Retangulo retangulo = new Retangulo("Branco", 20.5, 60);
        Circulo circulo = new Circulo("Preto", 5);
        Triangulo triangulo = new Triangulo("Rosa", 20, 10, 10.5, 10, 10.5);

        retangulo.exibir();
        circulo.exibir();
        triangulo.exibir();
    }
}
