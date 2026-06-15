package com.joaotrilhas.trilha2.atividade2;

public class PlacarTeste {

    public static void main(String[] args) {

        Placar p = new Placar();
        p.timeCasa = "Figueirense";
        p.timeVisitante = "Joinville";

        p.marcarGolCasa();
        p.marcarGolCasa();
        p.marcarGolVisitante();

        p.exibirPlacar();
    }
}
