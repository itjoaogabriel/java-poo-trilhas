package com.joaotrilhas.trilha5.desafio3;

public class MainFuncionario {
    public static void main(String[] args) {

        Funcionario funcionario = new Funcionario("João", "Inspetor", 2500);
        Funcionario funcionario1 = new Funcionario("Ana", "Estagiária", 1300);

        funcionario.aplicarAumento(10);
        funcionario.demitir();
        funcionario.exibir();
        //funcionario1.aplicarAumento(60);
        funcionario1.aplicarAumento(40);
        funcionario1.exibir();
    }
}
