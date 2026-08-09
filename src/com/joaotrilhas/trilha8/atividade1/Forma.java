package com.joaotrilhas.trilha8.atividade1;

public abstract class Forma {

    private String cor;
    public String getCor() { return cor; }

    public Forma(String cor) {
        if (cor == null || cor.isEmpty()) {
            throw new IllegalArgumentException("Informe uma cor.");
        }
        this.cor = cor;
    }
    //Metódos abstratos - sem corpo e sem chaves
    public abstract double calcularArea();
    public abstract double calcularPerimetro();

    //Método concreto com implementação
    public void exibir() {
        System.out.printf("Cor: %s | Área: %.2f | Perímetro: %.2f%n",
                            getCor(),
                            calcularArea(),
                            calcularPerimetro());
    }
}
