package com.joaotrilhas.trilha3.desafio7;

public class Relogio {

    private int horas;
    private int minutos;
    private  int segundos;

    public void setHorario(int horas, int minutos, int segundos) {
        if (horas >= 0 && horas < 24) {
            this.horas = horas;
        }
        if (minutos >= 0 && minutos < 60) {
            this.minutos = minutos;
        }
        if (segundos >= 0 && segundos < 60) {
            this.segundos = segundos;
        }
    }

    public void avancarSegundo() {
        segundos++;
        if (segundos == 60) {
            minutos++;
            segundos = 0;
        }
        if (minutos == 60) {
            horas++;
            minutos = 0;
        }
        if (horas == 24) {
            horas = 0;
        }
    }

    public void exibir() {
        if(horas > 24 || minutos > 60 || segundos > 60) {
            System.out.println("Erro. Relógio bloqueado");
        } else {
        System.out.format("Relógio %n|%02d:%02d:%02d|%n", horas, minutos, segundos);
        }
    }
}