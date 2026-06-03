package com.joao.cursojava.aula13;

public class OperadoresAritmeticos {

    static void main(String[]args) {

        int resultado = 1 + 2;
        System.out.println(resultado);

        resultado = resultado - 1;
        System.out.println(resultado);

        resultado = resultado / 2;
        System.out.println(resultado);

        resultado = resultado + 8;
        System.out.println(resultado);

        //% é mod(módulo)
        resultado = resultado % 7;
        System.out.println(resultado);

        String primeiroNOme = "Está é";
        String segundoNome = " uma String concatenada.";
        String terceiroNome = primeiroNOme + segundoNome;
        System.out.println(terceiroNome);

        resultado++;
        System.out.println(resultado);
        System.out.println(resultado++); //Imprime o resultado e depois adciona 1
        System.out.println(++resultado); //= resultado + 1 e depois imprime
    }
}
