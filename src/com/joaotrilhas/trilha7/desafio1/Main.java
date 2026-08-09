package com.joaotrilhas.trilha7.desafio1;

public class Main {
    public static void main(String[] args) {

        Funcionario[] funcionarios = new Funcionario[3];
        funcionarios[0] = new Vendedor("João", 2000, 200);
        funcionarios[1] = new Gerente("Carla", 5000, 2000);
        funcionarios[2] = new Gerente("Clara", 5000, 3000);

        for (Funcionario funcionario:funcionarios) {
            funcionario.exibir();
        }
    }
}
