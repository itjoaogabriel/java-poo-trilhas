package com.joaotrilhas.trilha6.atividade1;

public class Main {
    public static void main(String[] args) {

        Animal animal = new Animal("Animal", 1);
        Cachorro cachorro = new Cachorro("Rex", 3);
        Gato gato = new Gato("Mimi", 2);

        animal.exibir();
        cachorro.exibir();
        gato.exibir();
    }
}
