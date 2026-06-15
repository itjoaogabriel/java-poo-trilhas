package com.joaotrilhas.trilha5.desafio7;

public class Main {
    public static void main(String[] args) {

        Turma turma1 = new Turma("001", "Português", "Joana", "manhã");
        Turma turma2 = new Turma("002", "Inglês", "Carla", "tarde");

        Aluno aluno1 = new Aluno("João", "1010", turma1);
        Aluno aluno2 = new Aluno("Ana", "1011", turma1);
        Aluno aluno3 = new Aluno("Pedro", "1012", turma2);
        Aluno aluno4 = new Aluno("Carla", "1013", turma2);

        aluno1.exibir();
        aluno2.exibir();
        aluno3.exibir();
        aluno4.exibir();
    }
}
