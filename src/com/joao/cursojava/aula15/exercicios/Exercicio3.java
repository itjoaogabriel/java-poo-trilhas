package com.joao.cursojava.aula15.exercicios;

import java.util.Scanner;

public class Exercicio3 {

    public static void  main(String[]args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Informe o primeiro valor:");
        double valor1 = scan.nextDouble();

        System.out.println("Informe o segundo valor:");
        double valor2 = scan.nextDouble();

        System.out.println("Informe o terceiro valor:");
        double valor3 = scan.nextDouble();
        double maiorValor;

        if (valor1 > valor2 && valor1 > valor3){
            maiorValor = valor1;
        } else if (valor2 > valor1 && valor2 > valor3){
            maiorValor = valor2;
        } else {
            maiorValor = valor3;
        }

        double menorValor;

        if (valor1 < valor2 && valor1 < valor3){
            menorValor = valor1;
        } else if (valor2 < valor1 && valor2 < valor3){
            menorValor = valor2;
        } else {
            menorValor = valor3;
        }

        System.out.println("O maior valor é: " + maiorValor);
        System.out.println("Omenor valor é: " + menorValor);
    }
}