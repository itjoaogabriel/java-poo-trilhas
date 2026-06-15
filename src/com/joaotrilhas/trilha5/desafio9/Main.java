package com.joaotrilhas.trilha5.desafio9;

public class Main {
    public static void main(String[] args) {

        Academia academia = new Academia("2007 Academia");

        Plano plano1 = new Plano("Premium", 150, 6);
        Plano plano2 = new Plano("Anual", 100, 12);

        Aluno aluno1 = new Aluno("João", "33922922209", plano2);
        academia.registrarPagamento(aluno1);
        Aluno aluno2 = new Aluno("Ana", "33922922206", plano2);
        academia.registrarPagamento(aluno2);
        Aluno aluno3 = new Aluno("Pedro", "33922942209", plano1);
        academia.registrarPagamento(aluno3);

        aluno1.exibirFicha();
        aluno2.exibirFicha();
        aluno3.exibirFicha();
        academia.exibirRelatorio();
    }
}
