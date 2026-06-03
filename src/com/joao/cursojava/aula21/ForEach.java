package com.joao.cursojava.aula21;

import java.util.Random;
import java.util.Scanner;

public class ForEach {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        scan.useLocale(java.util.Locale.US);

        int[] notas = new int[10];

        Random random = new Random();

        for (int i=0; i<notas.length; i++){

            notas[i] = random.nextInt(10);
        }

        for (int i=0; i<notas.length; i++){

            System.out.println(notas[i]);
        }

        System.out.println("Usando o for each");
        for (int nota : notas) {
            System.out.println(nota);
        }
        /*
            O for each é como se fosse essa situação abaixo:
            for (int i=0; i<notas.length; i++){
            é como se tivesse um int nota = notas[i] aqui.
            System.out.println(notas[i]);
            }
         */
    }
}
