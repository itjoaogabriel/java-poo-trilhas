package com.joaotrilhas.trilha7.desafio5;

public class Animal {

    private String nome;
    public String getNome() { return nome; }

    public Animal(String nome) {
        if (nome == null || nome.isEmpty()) {
            throw new IllegalArgumentException("Informe um nome.");
        }
        this.nome = nome;
    }

    public String emitirSom() {
        return "lala";
    }

    public void alimentar(String racao) {
        if (racao == null || racao.isEmpty()) {
            throw new IllegalArgumentException("Informe a ração.");
        }
        System.out.printf("Alimentando %s com %s.%n",
                            getNome(),
                            racao);
    }

    public void alimentar(String racao, int quantidadeGramas) {
        if (racao == null || racao.isEmpty()) {
            throw new IllegalArgumentException("Informe a ração.");
        }
        if (quantidadeGramas < 0) {
            throw new IllegalArgumentException("Quantidade em gramas não pode ser negativa.");
        }
        System.out.printf("Alimentando %s com %dg de %s.%n",
                getNome(),
                quantidadeGramas,
                racao);
    }

    public void exibir() {
        System.out.printf("Nome: %s%n", getNome());
        System.out.println(emitirSom());
    }
}