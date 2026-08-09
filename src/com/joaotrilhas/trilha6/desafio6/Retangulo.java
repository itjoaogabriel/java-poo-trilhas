package com.joaotrilhas.trilha6.desafio6;

public class Retangulo extends Forma {

    private double largura;
    private double altura;

    public double getAltura() { return altura; }
    public double getLargura() { return largura; }

    public Retangulo(String cor, double altura, double largura) {
        super(cor);
        if (altura < 0) {
            throw new IllegalArgumentException("Altura não pode ser negativa.");
        }
        if (largura < 0) {
            throw new IllegalArgumentException("Largura não pode ser negativa.");
        }
        this.altura = altura;
        this.largura = largura;
    }
    @Override
    public double calcularArea() {
        return altura * largura;
    }
    @Override
    public double calcularPerimetro() {
        return 2 * (altura + largura);
    }
    @Override
    public void exibir() {
        System.out.println("Retângulo");
        System.out.format("Altura: %.2f | Largura: %.2f%n",
                            getAltura(),
                            getLargura());
        super.exibir();
    }
}
