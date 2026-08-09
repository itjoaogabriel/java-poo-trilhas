package com.joaotrilhas.trilha8.desafio2;

public class Main {
    public static void main(String[] args) {

        Veiculo[] veiculos = new Veiculo[3];

        veiculos[0] = new Carro("Fiat", "Mobi", 2015, 4);
        veiculos[1] = new Moto("Honda", "Pop", 2000, 200);
        veiculos[2] = new Caminhao("Volkswagen", "Kombi", 1999, 2000);

        for(Veiculo a : veiculos) {
            a.exibir();
        }
    }
}
