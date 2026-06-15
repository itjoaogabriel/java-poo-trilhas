package com.joaotrilhas.trilha3.desafio2;

public class FuncionarioTeste {

    public static void main(String[] args) {

        Funcionario funcionario = new Funcionario();

        funcionario.setNome("João");
        funcionario.setCargo("Inspetor de qualidade");
        funcionario.setSalario(2000);
        funcionario.aplicarAumento(200);
        funcionario.exibirAmento();
    }
}
