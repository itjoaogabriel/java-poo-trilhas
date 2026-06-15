package com.joaotrilhas.trilha3.desafio8;

public class Placar {

    private String timeA;
    private String timeB;
    private int golsA;
    private int golsB;

    public void setTimes(String timeA, String timeB) {
        this.timeA = timeA;
        this.timeB = timeB;
    }

    public void marcarGol(String time) {
        if (time.equals(timeA)) {
            golsA++;
        }
        if (time.equals(timeB)) {
            golsB++;
        }
        if (!time.equals(timeA) && !time.equals(timeB)){
            System.out.println("Nome do time informado inválido.");
        }
    }

    public String getResultado() {
        return timeA + " " + golsA + " x " + timeB + " " + golsB;
    }

    public void exibirVencedor() {
        if (golsA > golsB) {
            System.out.format("Time %s vencedor!%n", timeA);
        } else if (golsB > golsA) {
            System.out.format("Time %s vencedor!%n", timeB);
        } else {
            System.out.format("\nEmpate!%n");
        }
        System.out.println("Placar \n" + getResultado());
    }
}
