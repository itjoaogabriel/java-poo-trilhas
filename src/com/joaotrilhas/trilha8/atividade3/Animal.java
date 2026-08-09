package com.joaotrilhas.trilha8.atividade3;

public abstract class Animal {

    private String nome;
    public String getNome() { return nome; }

    public Animal(String nome) { this.nome = nome; }

    public abstract void emitirSom();
    public abstract void mover();
}
