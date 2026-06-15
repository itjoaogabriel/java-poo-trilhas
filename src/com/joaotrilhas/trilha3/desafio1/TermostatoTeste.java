package com.joaotrilhas.trilha3.desafio1;

public class TermostatoTeste {

    public static void main(String[] args) {

        Termostato termostato = new Termostato();

        termostato.setTemperatura(5);
        termostato.setTemperatura(15);
        termostato.setTemperatura(-15);

        termostato.exibir();
    }
}
