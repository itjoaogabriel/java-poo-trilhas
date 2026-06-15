package com.joaotrilhas.trilha5.desafio5;

public class Veiculo {

    private String marca;
    private String modelo;
    private int ano;
    private double quilometragem;

    public String getMarca() { return marca; }
    public String getModelo() { return modelo; }
    public int getAno() { return ano; }
    public double getQuilometragem() { return quilometragem; }
    public int getIdade() { return 2025 - ano; }
    public boolean isZeroKm() { return quilometragem == 0; }

    public Veiculo(String marca, String modelo, int ano, double quilometragem) {
        if (marca == null || marca.isEmpty()) {
            throw new IllegalArgumentException("Preencha o campo marca.");
        }
        if (modelo == null || modelo.isEmpty()) {
            throw new IllegalArgumentException("Preencha o campo modelo.");
        }
        if (ano < 1886 || ano > 2025) {
            throw new IllegalArgumentException("Informe um ano válido.");
        }
        if (quilometragem < 0) {
            throw new IllegalArgumentException("A quilometragem não pode ser negativa.");
        }
        this.marca = marca;
        this.modelo = modelo;
        this.ano = ano;
        this.quilometragem = quilometragem;
    }

    public void registrarViagem(double km) {
        if (km < 0) {
            throw new IllegalArgumentException("A quilometragem não pode ser negativa.");
        }
        quilometragem += km;
    }

    public void exibirFicha() {
        System.out.println("Ficha veículo");
        System.out.format("Marca: %s | Modelo: %s | Ano: %d | Quilometragem: %.2fkm%nSituação: %s%n%n",
                            getMarca(),
                            getModelo(),
                            getAno(),
                            getQuilometragem(),
                            isZeroKm() ? "Novo" : "Usado");
    }
}