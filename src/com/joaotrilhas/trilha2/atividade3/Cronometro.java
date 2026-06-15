package com.joaotrilhas.trilha2.atividade3;

public class Cronometro {

    int segundos;

    void iniciar(int tempo) {
        segundos = tempo;
    }

    void avancar(int s) {
        segundos = segundos + s;
    }

    void resetar() {
        segundos = 0;
    }

    String formatarTempo() {
        int minutos = segundos / 60;
        int segs = segundos % 60;

        return  String.format("%02d:%02d", minutos, segs);
    }
}
