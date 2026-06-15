package com.joaotrilhas.trilha1.desafio5;

public class PetTeste {

    public static void main(String[] args) {

        Pet pet1 = new Pet();
        Pet pet2 = new Pet();
        Pet pet3 = new Pet();

        pet1.nome = "Totó";
        pet1.especie = "Lulu da pomerânia";
        pet1.idade = 2;
        pet1.peso = 10;

        pet1.exibirFicha();
        System.out.println();

        pet2.nome = "Lulu";
        pet2.especie = "Shitzu";
        pet2.idade = 1;
        pet2.peso = 15;

        pet2.exibirFicha();
        System.out.println();

        pet3.nome = "Bobby";
        pet3.especie = "Pastor alemão";
        pet3.idade = 10;
        pet3.peso = 30;

        pet3.exibirFicha();
    }
}
