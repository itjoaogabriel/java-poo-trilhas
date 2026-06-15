package com.joaotrilhas.trilha2.atividade2;

public class Placar {

    String timeCasa;
    String timeVisitante;
    int golsCasa;
    int golsVisitante;

    void marcarGolCasa() {
        golsCasa++;
    }

    void marcarGolVisitante() {
        golsVisitante++;
    }

    void exibirPlacar() {
        System.out.format("%s %d x %d %s%n",
        timeCasa, golsCasa, golsVisitante, timeVisitante);

        if (golsCasa > golsVisitante) {
            System.out.println("Vitória do time da casa!");
        } else if (golsVisitante > golsCasa) {
            System.out.println("Vitória do time visitante!");
        } else {
            System.out.println("Empate!");
        }
    }
}
