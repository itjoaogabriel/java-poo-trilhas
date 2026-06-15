package com.joaotrilhas.trilha6.atividade1;

public class Gato extends Animal {

    public Gato(String nome, int idade) {
        super(nome, idade); //chama construtor de Animal
    }

    @Override
    public void emitirSom() {
        System.out.format("%s faz: Au au!%n", getNome());
    }
}
