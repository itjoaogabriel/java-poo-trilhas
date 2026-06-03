package com.joao.cursojava.aula24;

public class TesteCarro {

    public static void main(String[] args){

        Carro van = new Carro();
        van.marca = "Fiat";
        van.modelo = "Ducato";
        van.numeroPassageiros = 10;
        van.capacidadeCombustivel = 100;
        van.consumoCombustivel = 0.2;

        System.out.println(van.marca);

        Carro fusca = new Carro();
        van.marca = "Fiat";
        van.modelo = "Ducato";
        van.numeroPassageiros = 4;
        van.capacidadeCombustivel = 10;
        van.consumoCombustivel = 0.2;
    }
}
