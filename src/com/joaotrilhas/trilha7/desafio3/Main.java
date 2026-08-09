package com.joaotrilhas.trilha7.desafio3;

public class Main {
    public static void main(String[] args) {

        Calculadora multiplicar = new Calculadora();

        System.out.println(multiplicar.multiplicar(10, 20));
        //neste caso é chamada a versão de multiplicação de dois inteiros
        System.out.println(multiplicar.multiplicar(10.5, 10.5));
        //nesse caso é chamada a versão que multiplica dois números reais
        System.out.println(multiplicar.multiplicar(1, 2, 3));
        //nesse caso é chamada a versão que multiplica três números inteiros
    }
}
