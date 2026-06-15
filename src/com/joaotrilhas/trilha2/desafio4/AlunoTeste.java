package com.joaotrilhas.trilha2.desafio4;

public class AlunoTeste {

    public static void main(String[] args) {

        Aluno aluno1 = new Aluno();
        Aluno aluno2 = new Aluno();
        Aluno aluno3 = new Aluno();

        aluno1.nome = "João";
        aluno1.nota1 = 8;
        aluno1.nota2 = 8.5;
        aluno1.nota3 = 9.5;

        aluno2.nome = "Pedro";
        aluno2.nota1 = 4;
        aluno2.nota2 = 3.5;
        aluno2.nota3 = 4;

        aluno3.nome = "Maria";
        aluno3.nota1 = 6;
        aluno3.nota2 = 5.5;
        aluno3.nota3 = 4.9;

        aluno1.exibirBoletim();
        aluno2.exibirBoletim();
        aluno3.exibirBoletim();
    }
}
