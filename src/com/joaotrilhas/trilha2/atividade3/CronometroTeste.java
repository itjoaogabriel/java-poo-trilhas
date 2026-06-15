package com.joaotrilhas.trilha2.atividade3;

public class CronometroTeste {

    public static void main(String[] args) {

        Cronometro c = new Cronometro();

        c.iniciar(90);
        System.out.println("Tempo: " + c.formatarTempo());

        c.avancar(45);
        System.out.println("Tempo: " + c.formatarTempo());

        c.resetar();
        System.out.println("Tempo: " + c.formatarTempo());
    }
}
