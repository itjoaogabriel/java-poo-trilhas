package com.joaotrilhas.trilha3.desafio1;

public class Termostato {

    private double temperatura;

    public void setTemperatura(double temperatura) {
        if (temperatura >= -10 && temperatura <= 50) {
            this.temperatura = temperatura;
        } else {
            System.out.format("Temperatura %.1f inválida.%n", temperatura);
        }
    }

    public double getTemperatura() {
        return temperatura;
    }

    public void exibir() {
        System.out.format("Temperatura: %.1f°%n", temperatura);
    }
}