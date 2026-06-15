package com.joaotrilhas.trilha5.desafio1;

public class MainAluno {
    public static void main(String[] args) {

        Aluno aluno1 = new Aluno("João", "8989", "Análise e Desenvolvimento de Sistemas");
        Aluno aluno2 = new Aluno("Pedro", "8988", "Análise e Desenvolvimento de Sistemas");
        Aluno aluno3 = new Aluno("Ana", "8987", "Análise e Desenvolvimento de Sistemas");
        //Aluno aluno = new Aluno();

        aluno1.exibir();
        aluno2.exibir();
        aluno3.exibir();
    }
}
