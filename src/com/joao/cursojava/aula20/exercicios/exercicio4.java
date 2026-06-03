package com.joao.cursojava.aula20.exercicios;

import java.util.Scanner;

public class exercicio4 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        scan.useLocale(java.util.Locale.US);

        String[][] compromissos = new String[30][24];

        boolean sair = false;
        boolean diaValido = false;
        boolean horaValida = false;
        int hora = 0;
        byte opcao;
        int dia = 0;

        while (!sair){

            System.out.println("Digite 1 para adicionar compromisso.");
            System.out.println("Digite 2 para verificar compromisso.");
            System.out.println("Digite 0 para sair.");

            opcao = scan.nextByte();

            if(opcao == 1) {
                while (!diaValido) {
                    System.out.println("Informe o dia do mês:");
                    dia = scan.nextInt();

                    if (dia > 0 && dia <= 31) {
                        diaValido = true;
                    } else {
                        System.out.println("Dia inválido. Digite novamente.");
                    }
                }

                while (!horaValida) {
                    System.out.println("Informe a hora do compromisso:");
                    hora = scan.nextInt();

                    if (hora > 0 && hora <= 24) {
                        horaValida = true;
                    } else {
                        System.out.println("Hora inválida. Digite novamente.");
                    }
                }
                dia--;

                System.out.println("Informe o compromisso.");
                compromissos[dia][hora] = scan.next();
            } else if (opcao == 2) {

                System.out.println("O compromisso agendado é:");
                System.out.println(compromissos[dia][hora]);
            } else {
                System.out.println("Programa encerrado.");
                break;
            }
        }
    }
}
