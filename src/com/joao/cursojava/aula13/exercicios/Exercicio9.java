package com.joao.cursojava.aula13.exercicios;

import java.util.Scanner;

public class Exercicio9 {

    static void main(String[]args) {

        Scanner scan = new Scanner(System.in);
        scan.useLocale(java.util.Locale.US);

        System.out.println("Informe a temperatura em Fahrenheit:");
        double temperaturaF = scan.nextDouble();

        double temperaturaC = 5 * (temperaturaF - 32) / 9;
        System.out.println("Temperatura " + temperaturaF + "°F em Celsius são " + temperaturaC + "°C.");
    }
}
