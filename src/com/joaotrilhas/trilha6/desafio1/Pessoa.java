package com.joaotrilhas.trilha6.desafio1;

public class Pessoa {

    private String nome;
    private int idade;

    public String getNome() { return nome; }
    public int getIdade() { return idade; }

    public Pessoa(String nome, int idade) {
        if (nome == null || nome.isEmpty()) {
            throw new IllegalArgumentException("Informe um nome.");
        }
        if (idade < 0 || idade > 120) {
            throw new IllegalArgumentException("Informe uma idade válida.");
        }
        this.nome = nome;
        this.idade = idade;
    }

    public void exibir() {
        System.out.format("Nome: %s | Idade: %d anos%n",
                            getNome(),
                            getIdade());
    }
}
