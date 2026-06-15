package com.joaotrilhas.trilha1.desafio4;

public class Retangulo {

    double largura;
    double altura;

    double calcularArea() {
        return altura * largura;
    }

    double calcularPerimetro() {
        return (altura * 2) + (largura * 2);
    }

    void exibirArea() {
        System.out.println("Área: " + calcularArea());
    }

    void exibirPerimetro() {
        System.out.println("Perímetro: " + calcularPerimetro());
    }
}
