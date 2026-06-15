package com.joaotrilhas.trilha1.desafio1;

public class AnimalTeste {

    public static void main(String[] args) {

        Animal animal1 = new Animal();

        animal1.nome = "gato";
        animal1.som = "meow";

        Animal animal2 = new Animal();

        animal2.nome = "cachorro";
        animal2.som = "au au";

        Animal animal3 = new Animal();

        animal3.nome = "coruja";
        animal3.som = "gru";

        animal1.fazerSom();
        animal2.fazerSom();
        animal3.fazerSom();
    }
}