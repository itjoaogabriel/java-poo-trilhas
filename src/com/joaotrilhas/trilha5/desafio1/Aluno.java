package com.joaotrilhas.trilha5.desafio1;

public class Aluno {

    private String nome;
    private String matricula;
    private String curso;

    public Aluno(String nome, String matricula, String curso) {
        this.nome = nome;
        this.matricula = matricula;
        this.curso = curso;
    }

    public String getNome() { return nome; }
    public String getMatricula() { return matricula; }
    public String getCurso() { return curso; }

    public void exibir() {
        System.out.format("Nome: %s | Matrícula: %s | Curso: %s%n",
                            getNome(),
                            getMatricula(),
                            getCurso());
    }
}
