package com.joaotrilhas.trilha2.desafio3;

public class Carro {

    String modelo;
    int velocidade;
    double combustivel;

    void acelerar (int km) {
        combustivel = combustivel - (km * 0.1);
        velocidade = velocidade + km;

    }

    void frear (int km) {
        if (velocidade - km >= 0) {
            velocidade = velocidade - km;
        } else {
            velocidade = 0;
            System.out.println("Velocidade zerada.");
        }
    }

    void exibirPainel() {
        System.out.println("Painel do carro: ");
        System.out.format("Modelo: %s | Velocidade: %dkm/h | Combustivel: %.2fL%n", modelo, velocidade, combustivel);

        if (combustivel < 0.5) {
            System.out.println("Alerta! Combustível abaixo de 0.5L.");
        }
    }
}
