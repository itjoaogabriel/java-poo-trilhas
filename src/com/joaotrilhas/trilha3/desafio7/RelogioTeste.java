package com.joaotrilhas.trilha3.desafio7;

public class RelogioTeste {

    public static void main(String[] args) {

        Relogio relogio = new Relogio();

        relogio.setHorario(20, 30, 55);

        for(int i = 1; i <= 130; i++) {
            relogio.avancarSegundo();
        }

        relogio.exibir();
    }
}