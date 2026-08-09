package com.joaotrilhas.trilha8.desafio8;

abstract class Forma {

    private String cor;

    public String getCor() { return cor; }

    public Forma(String cor) {
        if (cor == null || cor.isEmpty()) {
            throw new IllegalArgumentException("Informe uma cor.");
        }
        this.cor = cor;
    }

    abstract double calcularArea();
    abstract double calcularPerimetro();

    public void exibir() {
        System.out.printf("Cor: %s | Área: %.2f | Perímetro: %.2f%n",
                            getCor(),
                            calcularArea(),
                            calcularPerimetro());
    }
}
