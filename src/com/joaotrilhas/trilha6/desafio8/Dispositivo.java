package com.joaotrilhas.trilha6.desafio8;

public class Dispositivo {

    private String marca;
    private String modelo;
    private double preco;
    private boolean ligado;

    public String getMarca() { return marca; }
    public String getModelo() { return modelo; }
    public double getPreco() { return preco; }
    public boolean isLigado() { return ligado; }

    public Dispositivo(String marca, String modelo, double preco) {
        if (marca == null || marca.isEmpty()) {
            throw new IllegalArgumentException("Informe uma marca.");
        }
        if (modelo == null || modelo.isEmpty()) {
            throw new IllegalArgumentException("Informe um modelo.");
        }
        if (preco < 0) {
            throw new IllegalArgumentException("O preço não pode ser negativo.");
        }
        this.marca = marca;
        this.modelo = modelo;
        this.preco = preco;
        ligado = false;
    }

    public void ligar() {
        if (!ligado) ligado = true;
    }

    public void desligar() {
        if (ligado) ligado = false;
    }

    public void exibir() {
        System.out.format("Marca: %s | Modelo: %s | Preço R$%.2f | Situação: %s%n",
                            getMarca(),
                            getModelo(),
                            getPreco(),
                            isLigado() ? "Ligado" : "Desligado");
    }
}