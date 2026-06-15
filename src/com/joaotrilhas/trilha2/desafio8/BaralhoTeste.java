package com.joaotrilhas.trilha2.desafio8;

public class BaralhoTeste {

    public static void main(String[] args) {

        Baralho jogador1 = new Baralho();
        Baralho jogador2 = new Baralho();
        Baralho jogador3 = new Baralho();

        jogador1.comprarCarta(3);
        jogador2.comprarCarta(5);
        jogador3.comprarCarta(1);

        jogador1.exibirStatus();
        jogador2.exibirStatus();
        jogador3.exibirStatus();

        jogador1.embaralhar();
        jogador2.embaralhar();
        jogador3.embaralhar();
    }
}
