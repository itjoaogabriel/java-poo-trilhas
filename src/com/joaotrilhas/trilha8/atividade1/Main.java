package com.joaotrilhas.trilha8.atividade1;

public class Main {
    public static void main(String[] args) {

        //Forma f = new Forma("Azul");
        Forma c = new Circulo("Azul", 5);
        Forma r = new Retangulo("Branco", 10, 5);

        c.exibir();
        r.exibir();
    }
}
