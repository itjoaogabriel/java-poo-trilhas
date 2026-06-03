package com.joao.cursojava.aula15.exercicios;

import java.util.Scanner;

public class Exercicio1 {

    public static void  main(String[]args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Informe o primeiro valor:");
        double valor1 = scan.nextDouble();

        System.out.println("Informe o segundo valor:");
        double valor2 = scan.nextDouble();
        double maiorValor;

        if(valor1 > valor2){
            maiorValor = valor1;
        } else {
            maiorValor = valor2;
        }

        System.out.println("O maior valor entre " + valor1 + " e " + valor2 + " é: " + maiorValor);
    }
}