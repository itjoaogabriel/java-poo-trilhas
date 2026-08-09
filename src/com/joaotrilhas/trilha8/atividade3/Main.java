package com.joaotrilhas.trilha8.atividade3;

public class Main {
    public static void main(String[] args) {

        Animal[] animais = new Animal[3];

        animais[0] = new Cachorro("Thor");
        animais[1] = new Cachorro("Bob");
        animais[2] = new Leao("Luck");

        for (Animal a:animais) {
            a.emitirSom();
            a.mover();

            if (a instanceof Cachorro c) {
                c.interagirComDono();
            }
        }
    }
}
