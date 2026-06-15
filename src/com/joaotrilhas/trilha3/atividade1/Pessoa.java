package com.joaotrilhas.trilha3.atividade1;

public class Pessoa {

    private String nome;
    private int idade;

    public  void setNome(String nome) {
        this.nome = nome;
    }

    public void setItade(int idade) {
        if (idade >= 0) { // regra: idade não pode ser negativa
            this.idade = idade;
        } else {
            System.out.println("Idade inválida.");
        }
    }

    public void apresentar() {
        System.out.format("Nome: %s | Idade: %d%n", nome, idade);
    }
}
