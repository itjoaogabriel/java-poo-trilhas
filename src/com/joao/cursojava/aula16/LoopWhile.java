package com.joao.cursojava.aula16;

public class LoopWhile {

    public static void  main(String[]args) {

        int i = 1;
        int max = 10;

        System.out.println("Contando até " + max);

        while(i <= max) {
            System.out.println("Valor " + i + " é: " + i);
            i++;
        }

        System.out.println(i);

        do {
            i++;
            System.out.println("Valor " + i + " é: " + i);
        } while (i < 15);

        System.out.print(i);
    }
}
