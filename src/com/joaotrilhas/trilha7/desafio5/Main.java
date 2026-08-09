package com.joaotrilhas.trilha7.desafio5;

public class Main {
    public static void main(String[] args) {

        Animal[] animais = new Animal[4];

        animais[0] = new Cachorro("Bob");
        animais[1] = new Cachorro("Lupi");
        animais[2] = new Gato("Marrie");
        animais[3] = new Gato("Dobby");

        for (Animal a:animais) {
            a.exibir();
        }
        animais[0].alimentar("Pedigree", 50);
        animais[2].alimentar("Whiskas");
    }
}
