package com.joaotrilhas.trilha6.atividade3;

public class Veiculo {

    private String marca;
    private String modelo;
    private int ano;

    public Veiculo(String marca, String modelo, int ano) {
        if (ano < 1886 || ano > 2025) {
            throw new IllegalArgumentException("Ano inválido.");
        }
        this.marca = marca;
        this.modelo = modelo;
        this.ano = ano;
    }

    public String getMarca() { return marca; }
    public String getModelo() { return modelo; }
    public int getAno() { return ano; }

    public void exibir() {
        System.out.format("Marca: %s | Modelo: %s | Ano: %d%n",
                            getMarca(),
                            getModelo(),
                            getAno());
    }
}