package com.joaotrilhas.trilha8.desafio1;

public class Main {
    public static void main(String[] args) {

        double totalSalarios = 0;

        //Funcionario f1 = new Funcionario();
        Funcionario[] funcionarios = new Funcionario[3];
        funcionarios[0] = new Vendedor("João", 2000, 200);
        funcionarios[1] = new Gerente("Carla", 5000);
        funcionarios[2] = new Gerente("Clara", 5000);

        for (Funcionario funcionario:funcionarios) {
            funcionario.exibir();
            totalSalarios += funcionario.getSalario();
        }
        System.out.printf("Total salários: R$%.2f%n", totalSalarios);
    }
}
