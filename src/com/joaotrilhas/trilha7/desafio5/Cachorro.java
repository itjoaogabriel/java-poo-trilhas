package com.joaotrilhas.trilha7.desafio5;

public class Cachorro extends Animal {

    public Cachorro(String nome) {
        super(nome);
    }
    @Override
    public String emitirSom() {
        return "au au";
    }
}
