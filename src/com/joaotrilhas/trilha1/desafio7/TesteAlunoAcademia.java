package com.joaotrilhas.trilha1.desafio7;

public class TesteAlunoAcademia {

    public static void main(String[] args) {

        AlunoAcademia aluno1 = new AlunoAcademia();
        AlunoAcademia aluno2 = new AlunoAcademia();
        AlunoAcademia aluno3 = new AlunoAcademia();

        aluno1.nome = "João";
        aluno1.peso = 50;
        aluno1.altura = 1.70;

        aluno2.nome = "Ana";
        aluno2.peso = 70;
        aluno2.altura = 1.70;

        aluno3.nome = "Sarah";
        aluno3.peso = 100.0;
        aluno3.altura = 1.68;

        aluno1.classificar();

        aluno2.classificar();

        aluno3.classificar();
    }
}
