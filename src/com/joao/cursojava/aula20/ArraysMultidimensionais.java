package com.joao.cursojava.aula20;

import java.util.Scanner;

public class ArraysMultidimensionais {

    public static void  main(String[]args) {

        Scanner scan = new Scanner(System.in);
        scan.useLocale(java.util.Locale.US);

        double[][] notasAlunos = new double[4][4];

        for(int i = 0; i < 4; i++) {
            for(int j = 0; j < 4; j++){

                System.out.print("Informe a nota " + (j+1) + " do " + (i+1) + "º aluno:");
                notasAlunos[i][j] = scan.nextDouble();
            }
        }

        for(int i = 0; i < 4; i++) {
            for(int j = 0; j < 4; j++){

                System.out.print("[" + notasAlunos[i][j] + "]");
            }
            System.out.println();
        }

        System.out.println("Calculando a média de cada aluno");

        double soma;

        for(int i = 0; i < 4; i++) {

            soma = 0;
            for(int j = 0; j < 4; j++){
                soma += notasAlunos[i][j];
            }
            System.out.println("A média do aluno " + (i+1) + " é: " + (soma/4));
        }

        double[] notas1 = {7,8,9,10};

        double[][] notas2 = {{7,8,9,10}, {10,10,8,9}};
    }
}
