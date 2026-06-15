package com.joaotrilhas.trilha1.desafio5;

public class Pet {

    String nome;
    String especie;
    int idade;
    double peso;

    void exibirFicha() {
        System.out.println("Ficha do pet");
        System.out.println("Nome: " + nome);
        System.out.println("Espécie: " + especie);
        System.out.println("Idade: " + idade + " anos");
        System.out.println("Peso: " + peso + "kg");
    }
}
