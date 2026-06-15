package com.joao.cursojava.aula27.exercicios;

public class Lampada{

    String marca;
    String modelo;
    String capacidadeIluminacao;
    double numeroWatts;
    boolean ligada;

    void ligar(){
        ligada = true;
    }
    void desligar(){
        ligada = false;
    }
}