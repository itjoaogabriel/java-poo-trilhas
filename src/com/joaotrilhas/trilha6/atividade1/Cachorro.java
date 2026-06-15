package com.joaotrilhas.trilha6.atividade1;

public class Cachorro extends Animal {

    public Cachorro(String nome, int idade) {
        super(nome, idade); //chama construtor de Animal
    }

    @Override
    public void emitirSom() {
        System.out.format("%s faz: Au au!%n", getNome());
    }
}
