package com.joaotrilhas.trilha8.desafio2;

public abstract class Veiculo {

    private String marca;
    private String modelo;
    private int ano;

    public String getMarca() { return marca; }
    public String getModelo() { return modelo; }
    public int getAno() { return ano; }
    public abstract String getTipoVeiculo();

    public Veiculo(String marca, String modelo, int ano) {
        if (marca == null || marca.isEmpty()){
            throw new IllegalArgumentException("Informe uma marca.");
        }
        if (modelo == null || modelo.isEmpty()){
            throw new IllegalArgumentException("Informe um modelo.");
        }
        if (ano < 1886 || ano > 2025){
            throw new IllegalArgumentException("Informe um ano válido.");
        }
        this.marca = marca;
        this.modelo = modelo;
        this.ano = ano;
    }

    public void exibir() {
        System.out.printf("%nTipo de veículo: %s%n", getTipoVeiculo());
        System.out.printf("%nMarca: %s | Modelo: %s%n",
                            getMarca(),
                            getModelo());
    }
}
