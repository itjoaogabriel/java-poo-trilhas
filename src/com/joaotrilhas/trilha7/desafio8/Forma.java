package com.joaotrilhas.trilha7.desafio8;

public class Forma {

    private final String cor;
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

    public Forma maiorArea(Forma outra) {
        if (this.calcularArea() > outra.calcularArea()) {
            return this;
        } else {
            return outra;
        }
    }

    public boolean maiorArea(double valorComparado) {
        return this.calcularArea() > valorComparado;
    }

    public void exibir() {
        System.out.format("Cor: %s | Área: %.2f%n",
                getCor(),
                calcularArea());
    }
}