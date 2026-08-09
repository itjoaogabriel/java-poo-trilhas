package com.joaotrilhas.trilha7.desafio2;

public class Circulo extends Forma {

    private double raio;
    public double getRaio() { return raio; }

    public Circulo(String cor, double raio) {
        super(cor);
        if (raio < 0) {
            throw new IllegalArgumentException("O raio não pode ser negativo.");
        }
        this.raio = raio;
    }
    public double calcularDiametro() {
        return raio * 2;
    }
    @Override
    public double calcularArea() {
        return Math.PI * (raio * raio);
    }
    @Override
    public void exibir() {
        System.out.println("Círculo");
        super.exibir();
        System.out.format("Raio: %.2f%n",
                getRaio());
    }
}
