package com.joaotrilhas.trilha7.atividade1;

public class Gato extends Animal {
    public Gato(String nome) { super(nome); }
    @Override
    public String emitirSom() { return "meow"; }
}
