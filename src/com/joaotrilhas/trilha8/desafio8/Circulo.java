package com.joaotrilhas.trilha8.desafio8;

public class Circulo extends Forma implements Redimensionavel {

    private double raio;

    public double getRaio() { return raio; }

    public Circulo(String cor, double raio) {
        super(cor);
        if (raio <= 0) {
            throw new IllegalArgumentException("O lado não pode ser negativo.");
        }
        this.raio = raio;
    }

    @Override
    public double calcularArea() {
        return Math.PI * Math.pow(raio, 2);
    }

    @Override
    public double calcularPerimetro() {
        return 2 * Math.PI * raio;
    }

    @Override
    public void redimensionar(double fator) {
        raio = fator * raio;
    }
}
