package com.joaotrilhas.trilha7.desafio2;

public class Forma {

    private String cor;
    public String getCor() { return cor; }

    public Forma(String cor) {
        if (cor == null || cor.isEmpty()) {
            throw new IllegalArgumentException("Informe uma cor.");
        }
        this.cor = cor;
    }

    public double calcularArea() {
        return 0;
    }

    public void exibir() {
        System.out.format("Cor: %s | Área: %.2f%n",
                            getCor(),
                            calcularArea());
    }
}
