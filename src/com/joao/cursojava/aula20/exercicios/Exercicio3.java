package com.joao.cursojava.aula20.exercicios;

import java.util.Scanner;

public class Exercicio3 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        scan.useLocale(java.util.Locale.US);

        double[][] numeros = new double[3][3];
        int qtdPares = 0;
        int qtdImpares = 0;

        for (int i = 0; i < numeros.length; i++){
            for (int j = 0; j < numeros[i].length; j++){

                System.out.println("Informe o " + (j+1) + "º valor da " + (i+1) + "ª linha:");
                numeros[i][j] = scan.nextDouble();

                if (numeros[i][j] % 2 == 0){
                    qtdPares++;
                } else {
                    qtdImpares++;
                }
            }
        }
        System.out.println("Matriz:");

        for (int i = 0; i < numeros.length; i++){
            for (int j = 0; j < numeros[i].length; j++){

                System.out.print("[" + numeros[i][j] + "]");
            }
            System.out.println();
        }

        System.out.println("Números pares: " + qtdPares);
        System.out.println("Números ímpares: " + qtdImpares);
    }
}
