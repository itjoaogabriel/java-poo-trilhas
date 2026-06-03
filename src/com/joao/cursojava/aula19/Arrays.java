package com.joao.cursojava.aula19;

import java.util.Scanner;

public class Arrays {

    public static void  main(String[]args){

        Scanner scan = new Scanner(System.in);
        scan.useLocale(java.util.Locale.US);

        double[] temperaturas = new double[5];

        for(int i = 0; i<5; i++){
            System.out.println("Informe a temperatura do dia " + (i+1) + ":");
            temperaturas[i] = scan.nextDouble();
        }

        for(int i = 0; i<5; i++){
            System.out.println("Temperatura do dia " + (i+1) + ":" + temperaturas[i]);
        }
        System.out.println("O tamanho do array: " + temperaturas.length);
    }
}
