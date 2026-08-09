package com.joaotrilhas.trilha7.desafio4;

public class Veiculo {

    private String marca;
    private String modelo;

    public String getMarca() { return marca; }
    public String getModelo() { return modelo; }

    public Veiculo(String marca, String modelo) {
        if (marca == null || marca.isEmpty()){
            throw new IllegalArgumentException("Informe uma marca.");
        }
        if (modelo == null || modelo.isEmpty()){
            throw new IllegalArgumentException("Informe um modelo.");
        }
        this.marca = marca;
        this.modelo = modelo;
    }

    public void exibir() {
        System.out.printf("%nMarca: %s | Modelo: %s%n",
                            getMarca(),
                            getModelo());
    }
}
