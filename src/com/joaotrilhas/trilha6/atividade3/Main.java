package com.joaotrilhas.trilha6.atividade3;

public class Main {
    static void main(String[] args) {

        Veiculo veiculo = new Veiculo("Fiat", "Uno", 2014);
        Carro carro = new Carro("Renauld", "Sandero", 2010, 5);
        Moto moto = new Moto("Honta", "Pop", 2016, 109);

        veiculo.exibir();
        carro.exibir();
        moto.exibir();
    }
}