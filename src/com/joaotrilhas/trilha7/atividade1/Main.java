package com.joaotrilhas.trilha7.atividade1;
//Polimorfismo básico com array
public class Main {
    public static void main(String[] args) {

        Animal[] animais = new Animal[3];
        animais[0] = new Cachorro("Rex");
        animais[1] = new Gato("Mimi");
        animais[2] = new Cachorro("Bolt");

        for (Animal a : animais) {
            System.out.format("%s diz: %s%n",
                                a.getNome(),
                                a.emitirSom());
        }
    }
}
