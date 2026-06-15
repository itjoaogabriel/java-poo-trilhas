package com.joaotrilhas.trilha4.desafio4;

public class FuncionarioTeste {
    static void main(String[] args) {

        Funcionario funcionario1 = new Funcionario();
        Funcionario funcionario2 = new Funcionario();

        funcionario1.setNome("João");
        funcionario1.setCargo("Inspetor");
        funcionario1.setSalario(2278.0);

        funcionario2.setNome("Ana");
        funcionario2.setCargo("Estagiária");
        funcionario2.setSalario(1100.0);

        funcionario1.aplicarAumento(20);
        funcionario2.aplicarAumento(50);
        funcionario2.aplicarAumento(51);
        funcionario2.demitir();
        funcionario2.aplicarAumento(10);

        funcionario1.exibir();
        funcionario2.exibir();
    }
}
