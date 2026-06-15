package com.joaotrilhas.trilha1.atividade1;

public class Carro {

    String marca; //atributo: guarda a marca do carro
    String cor; //atributo: guarda a cor do carro
    double velocidade; //atributo: guarda a velocidade atual

    void acelerar() {

        velocidade = velocidade + 10;
        System.out.format("Acelerando! Velocidade: %f%n", velocidade);
    }
}