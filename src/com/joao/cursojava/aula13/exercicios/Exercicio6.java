package com.joao.cursojava.aula13.exercicios;

import java.util.Scanner;

public class Exercicio6 {

    static void main(String[]args) {

        Scanner scan = new Scanner(System.in);
        scan.useLocale(java.util.Locale.US);

        System.out.println("Informe o raio do círculo:");
        double raioCirculo = scan.nextDouble();

        double areaDoCirculo;
        areaDoCirculo = Math.PI * (raioCirculo * raioCirculo);

        System.out.println("Valor da área do círculo é: " + areaDoCirculo);
    }
}
