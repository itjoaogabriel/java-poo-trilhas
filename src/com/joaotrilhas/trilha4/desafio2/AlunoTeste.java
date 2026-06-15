package com.joaotrilhas.trilha4.desafio2;

public class AlunoTeste {

    public static void main(String[] args) {

        Aluno aluno1 = new Aluno();
        Aluno aluno2 = new Aluno();
        Aluno aluno3 = new Aluno();

        aluno1.setNome("João");
        aluno1.setMatricula("123");
        aluno1.setNota1(10);
        aluno1.setNota2(8);
        aluno1.setNota3(10);

        aluno2.setNome("Paulo");
        aluno2.setMatricula("1223");
        aluno2.setNota1(3);
        aluno2.setNota2(3);
        aluno2.setNota3(3.5);

        aluno3.setNome("Ana");
        aluno3.setMatricula("11123");
        aluno3.setNota1(6);
        aluno3.setNota2(6);
        aluno3.setNota3(5);

        aluno1.exibirBoletim();
        aluno2.exibirBoletim();
        aluno3.exibirBoletim();
    }
}
