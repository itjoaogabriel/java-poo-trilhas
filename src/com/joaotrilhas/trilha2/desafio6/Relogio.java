package com.joaotrilhas.trilha2.desafio6;

public class Relogio {

    int horas;
    int minutos;
    int segundos;

    void avancarSegundo() {
        segundos++;

        if (segundos == 60) {
            segundos = 0;
            minutos++;
        }
        if (minutos >= 60){
            minutos = 0;
            horas++;
        }
        if (horas == 24) {
            horas = 0;
        }
    }

    void exibir() {
        System.out.format("Horário: %n%02d:%02d:%02d", horas, minutos, segundos);
    }
}
