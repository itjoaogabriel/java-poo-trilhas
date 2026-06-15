package com.joaotrilhas.trilha6.atividade1;

public class Animal {

    private String nome;
    private int idade;

    public Animal(String nome, int idade) {
        this.nome = nome;
        this.idade = idade;
    }

    public String getNome() { return nome; }
    public int getIdade() { return idade; }

    public void emitirSom() {
        System.out.println("Som genérico de animal.");
    }

    public void exibir() {
        System.out.format("Nome: %s | Idade: %d anos%n", getNome(), getIdade());
    }
}
