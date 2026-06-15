package com.joaotrilhas.trilha2.desafio8;

public class Baralho {

    int cartasRestantes = 52;

    void comprarCarta(int quantidade) {

        if (cartasRestantes >= quantidade) {
            cartasRestantes = cartasRestantes - quantidade;
        } else {
            System.out.println("Cartas restantes insuficientes.");
        }
    }

    int cartasCompradas() {
        return 52 - cartasRestantes;
    }

    void embaralhar() {
        cartasRestantes = 52;
        System.out.println("Jogo reiniciado.");
    }

    void exibirStatus() {
        System.out.println("Quantidade de cartas restantes: " + cartasRestantes + " | Quantidade de cartas compradas: " + cartasCompradas());
    }
}
