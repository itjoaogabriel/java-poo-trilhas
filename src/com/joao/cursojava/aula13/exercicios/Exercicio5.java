package com.joao.cursojava.aula13.exercicios;

import java.util.Scanner;

public class Exercicio5 {

    static void main(String[]args) {

        Scanner scan = new Scanner(System.in);
        scan.useLocale(java.util.Locale.US);

        System.out.println("Informe o valor desejado em metros para converter para centímetros:");
        double metros = scan.nextDouble();

        double centimetros;
        centimetros = metros * 100;

        System.out.println("O valor " + metros + "m em centímetros são: " + centimetros + "cm.");
    }
}
