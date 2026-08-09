package com.joaotrilhas.trilha7.desafio5;

public class Gato extends Animal {

    public Gato(String nome) {
        super(nome);
    }
    @Override
    public String emitirSom() {
        return "miau miau";
    }
}
