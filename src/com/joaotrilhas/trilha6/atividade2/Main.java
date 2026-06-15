package com.joaotrilhas.trilha6.atividade2;

public class Main {
    public static void main(String[] args) {

        Funcionario funcionario = new Funcionario("João", "Inspetor", 2000);
        Gerente gerente = new Gerente("Carlos", 10000, "Financeiro");

        funcionario.exibir();
        gerente.exibir();
    }
}