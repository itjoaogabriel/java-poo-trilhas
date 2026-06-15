package com.joaotrilhas.trilha5.desafio5;

public class MainVeiculo {
    public static void main(String[] args) {

        Veiculo veiculo1 = new Veiculo("Fiat", "Uno", 2010, 180000.0);
        Veiculo veiculo2 = new Veiculo("Fiat", "Palio", 2014, 100000.0);
        Veiculo veiculo3 = new Veiculo("Fiat", "Mobi", 2025, 0);

        veiculo1.registrarViagem(300);
        veiculo1.exibirFicha();

        //veiculo2.registrarViagem(-10);
        veiculo2.registrarViagem(10);
        veiculo2.registrarViagem(15);
        veiculo2.registrarViagem(20);
        veiculo2.exibirFicha();

        veiculo3.registrarViagem(0);
        veiculo3.exibirFicha();
    }
}
