package com.joaotrilhas.trilha8.desafio8;

public class Triangulo extends Forma implements Redimensionavel {

    private double base;
    private double altura;
    private double lado1;
    private double lado2;
    private double lado3;

    public double getBase() { return base; }
    public double getAltura() { return altura; }
    public double getLado1() { return lado1; }
    public double getLado2() { return lado2; }
    public double getLado3() { return lado3; }

    public Triangulo(String cor, double base, double altura, double lado1, double lado2, double lado3) {
        super(cor);
        if (base <= 0) {
            throw new IllegalArgumentException("O valor da base não pode ser negativo.");
        }
        if (altura <= 0) {
            throw new IllegalArgumentException("O valor da altura não pode ser negativo.");
        }
        if (lado1 <= 0) {
            throw new IllegalArgumentException("O valor do lado1 não pode ser negativo.");
        }
        if (lado2 <= 0) {
            throw new IllegalArgumentException("O valor do lado2 não pode ser negativo.");
        }
        if (lado3 <= 0) {
            throw new IllegalArgumentException("O valor do lado3 não pode ser negativo.");
        }
        this.base = base;
        this.altura = altura;
        this.lado1 = lado1;
        this.lado2 = lado2;
        this.lado3 = lado3;
    }

    @Override
    public double calcularArea() {
        return (altura * base) / 2;
    }

    @Override
    public double calcularPerimetro() {
        return lado1 + lado2 + lado3;
    }

    @Override
    public void redimensionar(double fator) {
        altura = fator * altura;
        base = fator * base;
        lado1 = fator * lado1;
        lado2 = fator * lado2;
        lado3 = fator * lado3;
    }
}
