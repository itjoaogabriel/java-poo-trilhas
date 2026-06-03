package com.joao.cursojava.aula13.exercicios;

import java.util.Scanner;

public class Exercicio8 {

    static void main(String[]args) {

        Scanner scan = new Scanner(System.in);
        scan.useLocale(java.util.Locale.US);

        System.out.println("Informe o valor em R$ da hora de trabalho do funcionário:");
        double salarioHora = scan.nextDouble();

        System.out.println("Informe o número de horas trabalhadas no mês:");
        double horasTrabalhadas = scan.nextDouble();

        double salario = salarioHora * horasTrabalhadas;
        System.out.println("O salário bruto do funcionário é: " + salario);
    }
}
