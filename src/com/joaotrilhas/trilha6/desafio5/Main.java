package com.joaotrilhas.trilha6.desafio5;

public class Main {
    public static void main(String[] args) {

        Carro carro = new Carro("Fiat", "Punto", 2015, 70, 5, "Gasolina");
        Moto moto = new Moto("Honda", "Pop", 2010, 200, 10, false);
        Caminhao caminhao = new Caminhao("Volvo", "V", 2025, 0, 3, 10);

        carro.registrarViagem(200);
        carro.exibir();
        moto.registrarViagem(10);
        moto.registrarViagem(20);
        moto.registrarViagem(5);
        moto.exibir();
        caminhao.exibir();
    }
}