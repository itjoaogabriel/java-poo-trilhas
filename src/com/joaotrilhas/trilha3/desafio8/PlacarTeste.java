package com.joaotrilhas.trilha3.desafio8;

public class PlacarTeste {
    public static void main(String[] args) {

        Placar partida = new Placar();

        partida.setTimes("Joinville", "Curitiba");
        partida.marcarGol("Joinville");
        partida.marcarGol("Joinville");
        partida.marcarGol("Joinville");
        partida.marcarGol("Curitiba");
        partida.marcarGol("Curitiba");
        partida.exibirVencedor();

        Placar partida2 = new Placar();

        partida2.setTimes("Joinville", "Curitiba");
        partida2.marcarGol("Joinville");
        partida2.marcarGol("Joinville");
        partida2.marcarGol("Curitiba");
        partida2.marcarGol("Curitiba");
        partida2.marcarGol("Curitiba");
        partida2.marcarGol("Joinville");
        partida2.exibirVencedor();
    }
}