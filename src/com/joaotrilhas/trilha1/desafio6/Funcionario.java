package com.joaotrilhas.trilha1.desafio6;

public class Funcionario {

    String nome;
    String cargo;
    double salario;

    void aplicarAumento(double percentual) {

        salario = salario + (salario * (percentual / 100));
    }

    void exibirNovoSalario() {

        System.out.println("\nDados funcionário");
        System.out.println("Nome: " + nome);
        System.out.println("Cargo: " + cargo);
        System.out.format("Novo salário R$ %.2f", salario);
    }
}