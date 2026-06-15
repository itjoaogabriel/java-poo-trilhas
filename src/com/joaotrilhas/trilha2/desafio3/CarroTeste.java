package com.joaotrilhas.trilha2.desafio3;

public class CarroTeste {

    public static void main(String[] args) {

        Carro carro1 = new Carro();

        carro1.modelo = "Jeep";
        carro1.velocidade = 60;
        carro1.combustivel = 50.0;

        carro1.acelerar(10);
        carro1.acelerar(5);
        carro1.frear(10);
        carro1.acelerar(20);

        carro1.exibirPainel();
    }
}
