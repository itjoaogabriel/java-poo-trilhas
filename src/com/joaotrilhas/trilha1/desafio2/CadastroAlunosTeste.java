package com.joaotrilhas.trilha1.desafio2;

public class CadastroAlunosTeste {
    public static void main(String[] args) {

        CadastroAlunos aluno1 = new CadastroAlunos();

        aluno1.nome = "Matheus Vicente";
        aluno1.matricula = "016130";
        aluno1.nota = 8.5;

        CadastroAlunos aluno2 = new CadastroAlunos();

        aluno2.nome = "Enzo";
        aluno2.matricula = "016131";
        aluno2.nota = 5.0;

        CadastroAlunos aluno3 = new CadastroAlunos();

        aluno3.nome = "Ana Carolina";
        aluno3.matricula = "016132";
        aluno3.nota = 8.0;

        aluno1.verificarSituacao();
        aluno2.verificarSituacao();
        aluno3.verificarSituacao();
    }
}
