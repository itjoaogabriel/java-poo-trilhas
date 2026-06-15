package com.joaotrilhas.trilha1.desafio1;
/*
Crie uma classe Animal com os atributos nome (String) e som (String). Adicione um método void
fazerSom() que imprima algo como: "O gato faz: miau". No Main, crie 3 objetos com animais
diferentes e chame o método para cada um.
 */
public class Animal {

    String nome;
    String som;

    void fazerSom() {
        System.out.format("O %s faz: %s%n", nome, som);
    }
}