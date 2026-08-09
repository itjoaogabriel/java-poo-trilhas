package com.joaotrilhas.trilha8.desafio8;

public class Quadrado extends Forma implements Redimensionavel {

    private double lado;

    public double getLado() { return lado; }

    public Quadrado(String cor, double lado) {
        super(cor);
        if (lado <= 0) {
            throw new IllegalArgumentException("O lado não pode ser negativo.");
        }
        this.lado = lado;
    }

    @Override
    public double calcularArea() {
        return lado * lado;
    }

    @Override
    public double calcularPerimetro() {
        return lado * 4;
    }

    @Override
    public void redimensionar(double fator) {
        lado = lado * fator;
    }
}
