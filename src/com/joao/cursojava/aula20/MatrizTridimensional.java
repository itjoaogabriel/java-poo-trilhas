package com.joao.cursojava.aula20;

import java.util.Scanner;

public class MatrizTridimensional {

    public static void  main(String[]args) {

        Scanner scan = new Scanner(System.in);
        scan.useLocale(java.util.Locale.US);

        int[][][] matrizTridimensional = new int[3][3][3];

        for (int i = 0; i < matrizTridimensional.length; i++){
            for (int j = 0; j < matrizTridimensional[i].length; j++){
                for (int k = 0; k < matrizTridimensional[j][j].length; k++){
                    matrizTridimensional[i][j][k] = i + j + k;
                }
            }
        }

        int soma = 0;
        int somaPares = 0;
        int somaImpares = 0;
        for (int i = 0; i < matrizTridimensional.length; i++){
            for (int j = 0; j < matrizTridimensional[i].length; j++){
                for (int k = 0; k < matrizTridimensional[j][j].length; k++){
                    soma += matrizTridimensional[i][j][k];

                    if(matrizTridimensional[i][j][k] % 2 == 0){
                        somaPares += matrizTridimensional[i][j][k];
                    } else {
                        somaImpares += matrizTridimensional[i][j][k];
                    }
                }
            }
        }

        System.out.println("Valor soma: " + soma);
        System.out.println("Valor soma pares: " + somaPares);
        System.out.println("Valor soma impares: " + somaImpares);
    }
}
