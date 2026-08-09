package com.joaotrilhas.trilha8.atividade3;

public class Leao extends Animal {

    public Leao(String nome) { super(nome); }
    @Override
    public void emitirSom() { System.out.printf("%s: Roarrr!%n", getNome()); }
    @Override
    public void mover() { System.out.printf("%s caça.%n", getNome()); }
}
