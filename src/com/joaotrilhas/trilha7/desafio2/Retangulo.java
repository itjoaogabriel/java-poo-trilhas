package com.joaotrilhas.trilha7.desafio2;

public class Retangulo extends Forma {

    private double largura;
    private double altura;

    public double getLargura() { return largura; }
    public double getAltura() { return altura; }

    public Retangulo(String cor, double largura, double altura) {
        super(cor);
        if (largura < 0) {
            throw new IllegalArgumentException("A largura não pode ser negativa.");
        }
        if (altura < 0) {
            throw new IllegalArgumentException("A altura não pode ser negativa.");
        }
        this.largura = largura;
        this.altura = altura;
    }
    @Override
    public double calcularArea() {
        return altura * largura;
    }
    @Override
    public void exibir() {
        System.out.println("Retângulo");
        super.exibir();
        System.out.format("Largura: %.2f | Altura: %.2f%n",
                            getLargura(),
                            getAltura());
    }
}
