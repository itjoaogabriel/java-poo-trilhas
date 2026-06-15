package com.joaotrilhas.trilha1.desafio8;

public class Personagem {

    String nome;
    int vida;
    int ataque;

    void atacar(Personagem alvo) {
        alvo.vida = alvo.vida - ataque;
    }

    void exibirStatus() {
        System.out.println("Status personagem " + nome);
        System.out.format("Vida: %d", vida);
    }
}