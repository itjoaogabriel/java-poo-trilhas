package com.joaotrilhas.trilha2.atividade1;

public class TermometroTeste {

    public static void main(String[] args) {

        Termometro t = new Termometro();
        t.temperatura = 20.0;

        t.aquecer(15.0);
        t.exibir();

        t.resfriar(8.0);
        t.exibir();
    }
}
