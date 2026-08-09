package com.joaotrilhas.trilha6.desafio6;

public class Circulo extends Forma {

    private double raio;
    public double getRaio() { return raio; }

    public Circulo(String cor, double raio) {
        super(cor);
        if (raio < 0) {
            throw new IllegalArgumentException("Raio não pode ser negativo.");
        }
        this.raio = raio;
    }
    @Override
    public double calcularArea() {
        return Math.PI * raio * raio;
    }
    @Override
    public double calcularPerimetro() {
        return 2 * Math.PI * raio;
    }
    @Override
    public void exibir() {
        System.out.println("Círculo");
        System.out.format("Raio: %.2f%n",
                getRaio());
        super.exibir();
    }
}
