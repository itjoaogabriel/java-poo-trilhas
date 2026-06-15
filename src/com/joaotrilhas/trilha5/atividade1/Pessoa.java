package com.joaotrilhas.trilha5.atividade1;

public class Pessoa {

    private String nome;
    private int idade;

    //Construtor padrão
    public Pessoa() {
        this.nome = "Sem nome";
        this.idade = 0;
    }

    //Construtor parametrizado
    public Pessoa(String nome, int idade) {
        this.nome = nome;
        this.idade = idade;
    }

    public String getNome() { return nome; }
    public int getIdade() { return idade; }

    public void exibir() {
        System.out.format("Nome: %s | Idade: %d%n", getNome(), getIdade());
    }
}
