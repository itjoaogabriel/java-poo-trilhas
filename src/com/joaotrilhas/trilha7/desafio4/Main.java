package com.joaotrilhas.trilha7.desafio4;

public class Main {
    public static void main(String[] args) {

        int quantidadeCarro = 0;
        int quantidadeMoto = 0;

        Veiculo[] veiculos = new Veiculo[4];

        veiculos[0] = new Carro("Fiat", "Mobi", 5);
        veiculos[1] = new Carro("Renault", "Sandero", 5);
        veiculos[2] = new Carro("Volkswagen", "Kombi", 12);
        veiculos[3] = new Moto("Honda", "Pop", 2);

        for(Veiculo a : veiculos) {
            a.exibir();
            if (a instanceof Carro c) {
                quantidadeCarro++;
            }
            if (a instanceof Moto c) {
                quantidadeMoto++;
            }
        }
        System.out.printf("Quantidade de carro: %d%n", quantidadeCarro);
        System.out.printf("Quantidade de moto: %d%n", quantidadeMoto);
    }
}
