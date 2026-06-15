package com.joaotrilhas.trilha2.desafio6;

public class RelogioTeste {

    public static void main() {

        Relogio relogio = new Relogio();

        relogio.horas = 1;
        relogio.minutos = 20;
        relogio.segundos = 0;

        for (int i = 1; i <= 130; i++) {
            relogio.avancarSegundo();
        }

        relogio.exibir();
    }
}
