package com.joaotrilhas.trilha1.desafio2;
/*
Você foi contratado para criar um sistema simples de cadastro de alunos. Crie uma classe Aluno
com os atributos nome, matricula (int) e nota (double). Adicione um método void
verificarSituacao() que imprima se o aluno está Aprovado (nota >= 6.0) ou Reprovado. Crie 3
alunos com notas diferentes e verifique a situação de cada um.
 */
public class CadastroAlunos {

    String nome;
    String matricula;
    double nota = 0.0;

    void verificarSituacao() {
        if(nota >= 6.0){
            System.out.format("Aprovado %s | Matrícula: %s | Nota: %.2f%n", nome, matricula, nota);
        } else {
            System.out.format("Reprovado %s | Matrícula: %s | Nota: %.2f%n", nome, matricula, nota);
        }
    }
}
