package com.joao.cursojava.aula27;

public class Carro {

    //declara classes
    String marca;
    String modelo;
    //declara atributos
    int numeroPassageiros;
    double capacidadeCombustivel;
    double consumoCombustivel;

    //declara os métodos
    void exibirAutonomia(){

        System.out.println("A autonomia do carro é " + capacidadeCombustivel * consumoCombustivel + " km");
    }

    double obterAutonomia() {

        System.out.println("Método obterAutonomia foi chamado.");

        return capacidadeCombustivel * consumoCombustivel;
    }

    //declara informação como parâmetro dentros das aspas
    double calcularCombustivel(double km){

        double qtdCombustivel = km/consumoCombustivel;

        return qtdCombustivel;
    }
}