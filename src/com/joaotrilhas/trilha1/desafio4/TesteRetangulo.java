package com.joaotrilhas.trilha1.desafio4;

public class TesteRetangulo {

    public static void main(String[] args) {

        Retangulo retangulo1 = new Retangulo();

        retangulo1.largura = 10.0;
        retangulo1.altura = 20.0;

        retangulo1.exibirArea();
        retangulo1.exibirPerimetro();

        Retangulo retangulo2 = new Retangulo();

        retangulo2.largura = 20.0;
        retangulo2.altura = 50.0;

        retangulo2.exibirArea();
        retangulo2.exibirPerimetro();

        Retangulo retangulo3 = new Retangulo();

        retangulo3.largura = 5.0;
        retangulo3.altura = 15.0;

        retangulo3.exibirArea();
        retangulo3.exibirPerimetro();
    }
}
