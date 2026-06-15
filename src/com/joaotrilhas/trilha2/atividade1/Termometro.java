package com.joaotrilhas.trilha2.atividade1;

public class Termometro {

    double temperatura;

    void aquecer (double graus) {
        temperatura = temperatura + graus;
    }

    void resfriar (double graus) {
        temperatura = temperatura - graus;
    }

    void exibir() {
        System.out.format("Temperatura atual: %.1f°C%n", temperatura);
    }
}
