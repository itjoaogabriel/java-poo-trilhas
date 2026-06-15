package com.joaotrilhas.trilha1.desafio8;

public class PersonagemTeste {

    public static void main(String[] args) {

        Personagem personagem1 = new Personagem();
        Personagem personagem2 = new Personagem();

        personagem1.nome = "Heroi";
        personagem1.vida = 1000;
        personagem1.ataque = 200;

        personagem2.nome = "Vilão";
        personagem2.vida = 900;
        personagem2.ataque = 100;

        personagem2.atacar(personagem1);
        personagem1.atacar(personagem2);
        personagem1.atacar(personagem2);
        personagem2.atacar(personagem1);
        personagem2.atacar(personagem1);
        personagem1.atacar(personagem2);

        personagem1.exibirStatus();
        System.out.println();

        personagem2.exibirStatus();
    }
}
