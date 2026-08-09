package com.joaotrilhas.trilha6.desafio5;

public class Veiculo {
    private String marca;
    private String modelo;
    private int ano;
    private double quilometragem;

    public String getMarca() { return marca; }
    public String getModelo() { return modelo; }
    public int getAno() { return ano; }
    public double getQuilometragem() { return quilometragem; }

    public Veiculo(String marca, String modelo, int ano, double quilometragem) {
        if (marca == null || marca.isEmpty()) {
            throw new IllegalArgumentException("Informe uma marca.");
        }
        if (modelo == null || modelo.isEmpty()) {
            throw new IllegalArgumentException("Informe um modelo.");
        }
        if (ano < 1886 || ano > 2025) {
            throw new IllegalArgumentException("Informe um ano válido.");
        }
        if (quilometragem < 0) {
            throw new IllegalArgumentException("Quilometragem não pode ser negativo.");
        }
        this.marca = marca;
        this.modelo = modelo;
        this.ano = ano;
        this.quilometragem = quilometragem;
    }

    public void registrarViagem(double km) {
        if (km < 0) {
            throw new IllegalArgumentException("Quilometragem não pode ser negativo.");
        }
        quilometragem += km;
    }

    public void exibir() {
        System.out.format("Marca: %s | Modelo: %s | Ano: %d | Quilometragem: %.2f%n",
                            getMarca(),
                            getModelo(),
                            getAno(),
                            getQuilometragem());
    }
}