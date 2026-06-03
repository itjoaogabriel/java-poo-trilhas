package com.joao.cursojava.aula13.exercicios;

import java.util.Scanner;

public class Exercicio7 {

    static void main(String[]args) {

        Scanner scan = new Scanner(System.in);
        scan.useLocale(java.util.Locale.US);

        System.out.println("Informe a altura dos lado de um quadrado:");
        double ladosQuadrado = scan.nextDouble();

        double areaQuadrado = ladosQuadrado * ladosQuadrado;
        System.out.println("O dobro da área do quadrado de lados " + ladosQuadrado + " é " + areaQuadrado * 2);
    }
}
