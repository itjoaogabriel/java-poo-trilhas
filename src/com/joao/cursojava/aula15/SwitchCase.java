package com.joao.cursojava.aula15;

import java.util.Scanner;

public class SwitchCase {

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
            case 1:
                System.out.println("Hoje o dia é Domingo.");
                break;
            case 2:
                System.out.println("Hoje o dia é Segunda-Feira.");
                break;
            case 3:
                System.out.println("Hoje o dia é Terça-Feira.");
                break;
            case 4:
                System.out.println("Hoje o dia é Quarta-Feira.");
                break;
            case 5:
                System.out.println("Hoje o dia é Quinta-Feira.");
                break;
            case 6:
                System.out.println("Hoje o dia é Sexta-Feira.");
                break;
            case 7:
                System.out.println("Hoje o dia é Sabádo.");
                break;
            default:
                System.out.println("Não é um dia da semana válido.");
                break;
        }
    }
}


