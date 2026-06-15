package com.joaotrilhas.trilha1.desafio6;

public class FuncionarioTeste {

    public static void main(String[] args) {

        Funcionario funcionario1 = new Funcionario();
        Funcionario funcionario2 = new Funcionario();

        funcionario1.nome = "João";
        funcionario1.cargo = "Assistente adm";
        funcionario1.salario = 2000.0;

        funcionario2.nome = "Clara";
        funcionario2.cargo = "Analista adm Jr";
        funcionario2.salario = 4000.0;

        funcionario1.aplicarAumento(5);
        funcionario2.aplicarAumento(20);

        funcionario1.exibirNovoSalario();
        System.out.println();
        funcionario2.exibirNovoSalario();
    }
}
