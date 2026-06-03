package com.joao.cursojava.aula13.exercicios;

import java.util.Scanner;

public class Exercicio10 {

    static void main(String[]args) {

        Scanner scan = new Scanner(System.in);
        scan.useLocale(java.util.Locale.US);

        System.out.println("Informe 2 numeros inteiros e um número real:");
        int numero1 = scan.nextInt();
        int numero2 = scan.nextInt();
        double numero3 = scan.nextDouble();
        double resultado = numero1 + numero2 + numero3;

        System.out.println("Resultado da operação: " + resultado);
    }
}
