package com.joaotrilhas.trilha6.desafio6;

public class Triangulo extends Forma{

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
        if (base < 0) {
            throw new IllegalArgumentException("Base não pode ser negativa.");
        }
        if (altura < 0) {
            throw new IllegalArgumentException("Altura não pode ser negativa.");
        }
        if (lado1 < 0) {
            throw new IllegalArgumentException("Lado 1 não pode ser negativo.");
        }
        if (lado2 < 0) {
            throw new IllegalArgumentException("Lado 2 não pode ser negativo.");
        }
        if (lado3 < 0) {
            throw new IllegalArgumentException("Lado 3 não pode ser negativo.");
        }
        this.base = base;
        this.altura = altura;
        this.lado1 = lado1;
        this.lado2 = lado2;
        this.lado3 = lado3;
    }
    @Override
    public double calcularArea() {
        return (base * altura) / 2;
    }
    @Override
    public double calcularPerimetro() {
        return lado1 + lado2 + lado3;
    }
    @Override
    public void exibir() {
        System.out.println("Triângulo");
        System.out.format("Base: %.2f | Altura: %.2f | Lado 1: %.2f | Lado 2: %.2f | Lado 3: %.2f %n",
                getBase(),
                getAltura(),
                getLado1(),
                getLado2(),
                getLado3());
        super.exibir();
    }
}