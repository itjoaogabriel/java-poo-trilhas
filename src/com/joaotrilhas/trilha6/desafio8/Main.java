package com.joaotrilhas.trilha6.desafio8;

public class Main {
    public static void main(String[] args) {

        Celular celular = new Celular("Samsung", "S26", 8000, "8922", 50);
        Notebook notebook = new Notebook("Lenovo", "Thinkpad", 2000, "Intel", 20);
        Tablet tablet = new Tablet("Samsung", "S9fe", 2000, 13, false);

        celular.ligar();
        celular.desligar();
        celular.carregar(10);
        celular.carregar(100);
        celular.exibir();
        notebook.ligar();
        notebook.exibir();
        tablet.ligar();
        tablet.desligar();
        tablet.exibir();
    }
}