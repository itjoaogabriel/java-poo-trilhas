package com.joaotrilhas.trilha2.desafio5;

public class AlunoAcademiaTeste {

    public static void main(String[] args) {

        AlunoAcademia aluno1 = new AlunoAcademia();
        AlunoAcademia aluno2 = new AlunoAcademia();

        aluno1.nome = "Ana";
        aluno1.plano = "Plus";
        aluno1.frequencia = 10;

        aluno2.nome = "Pedro";
        aluno2.plano = "Premium";
        aluno2.frequencia = 5;

        for (int i = 0; i < 20; i++) {
            aluno1.registrarPresenca();
        }

        for (int i = 0; i < 15; i++) {
            aluno2.registrarPresenca();
        }

        aluno1.exibirFrequencia();
        aluno2.exibirFrequencia();

        aluno1.exibirEngajamento();
        aluno2.exibirEngajamento();
    }
}
