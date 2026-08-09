package com.joaotrilhas.trilha8.atividade3;

public class Cachorro extends Animal implements Domesticavel {

    public Cachorro(String nome) { super(nome); }
    @Override
    public void emitirSom() { System.out.printf("%s: Au au!%n", getNome()); }
    @Override
    public void mover() { System.out.printf("%s corre.%n", getNome()); }
    @Override public void interagirComDono() { System.out.printf("%s abana o rabo.%n", getNome()); }
}
