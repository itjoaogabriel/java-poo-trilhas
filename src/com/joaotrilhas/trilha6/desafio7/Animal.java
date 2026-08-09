package com.joaotrilhas.trilha6.desafio7;

public class Animal {
    private String nome;
    private String especie;
    private double peso;

    public String getNome() { return nome; }
    public String getEspecie() { return especie; }
    public double getPeso() { return peso; }

    public Animal(String nome, String especie,double peso) {
        if (nome == null || nome.isEmpty()) {
            throw new IllegalArgumentException("Informe um nome.");
        }
        if (especie == null || especie.isEmpty()) {
            throw new IllegalArgumentException("Informe uma espécie.");
        }
        if (peso < 0) {
            throw new IllegalArgumentException("Informe um peso válido.");
        }
        this.nome = nome;
        this.especie = especie;
        this.peso = peso;
    }

    public String emitirSom() {
        return "a";
    }

    public void exibir() {
        System.out.format("%nNome: %s | Espécie: %s | Peso: %.2fkg | Som: %s%n",
                            getNome(),
                            getEspecie(),
                            getPeso(),
                            emitirSom());
    }
}
