package com.joao.cursojava.aula15.exercicios;

import java.util.Scanner;

public class Exercicio2 {

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

        System.out.println("O maior valor entre " + valor1 + ", " + valor2 + " e " + valor3 + " é: " + maiorValor);
    }
}
