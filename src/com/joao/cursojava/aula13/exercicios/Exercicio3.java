package com.joao.cursojava.aula13.exercicios;

import java.util.Scanner;

public class Exercicio3 {

    static void main(String[]args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Informe o primeiro número:");
        int numero1 = scan.nextInt();

        System.out.println("Informe o segundo número:");
        int numero2 = scan.nextInt();

        int resultado;
        resultado = numero1 + numero2;

        System.out.println("O número informado foi: " + resultado);
    }
}