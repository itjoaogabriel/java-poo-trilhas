package com.joao.cursojava.aula15;

import java.util.Scanner;

public class SwitchCaseExercicio {

    public static void  main(String[]args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Escolha um dos números abaixo.");
        System.out.println("1- Domingo");
        System.out.println("2- Segunda");
        System.out.println("3- Terça");
        System.out.println("4- Quarta");
        System.out.println("5- Quinta");
        System.out.println("6- Sexta");
        System.out.println("7- Sábado");
        int diaSemana = scan.nextInt();

        switch (diaSemana) {
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
                System.out.println("Dia útil.");
                break;
            case 1:
            case 7:
                System.out.println("Fim de semana!");
                break;
            default:
                System.out.println("Não é um dia da semana válido.");
                break;
        }
    }
}