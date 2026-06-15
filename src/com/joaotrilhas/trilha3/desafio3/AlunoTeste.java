package com.joaotrilhas.trilha3.desafio3;

public class AlunoTeste {

    static void main(String[] args) {

        Aluno aluno = new Aluno();

        aluno.setNome("João");
        aluno.setNota1(10);
        aluno.setNota2(8.5);
        aluno.setNota3(9);
        aluno.exibirBoletim();
    }
}
