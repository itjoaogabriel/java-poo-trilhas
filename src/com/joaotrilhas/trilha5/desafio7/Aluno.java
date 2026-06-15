package com.joaotrilhas.trilha5.desafio7;

public class Aluno {

    private String nome;
    private String matricula;
    private Turma turma;

    public String getNome() { return nome; }
    public String getMatricula() { return matricula; }
    public Turma getTurma() { return turma; }

    public Aluno(String nome, String matricula, Turma turma) {
        if (nome == null || nome.isEmpty()) {
            throw new IllegalArgumentException("Preencha o campo nome.");
        }
        if (matricula == null || matricula.isEmpty()) {
            throw new IllegalArgumentException("Preencha o campo matrícula.");
        }
        if (turma == null) {
            throw new IllegalArgumentException("Preencha o campo turma.");
        }
        this.nome = nome;
        this.matricula = matricula;
        this.turma = turma;
    }

    public void exibir() {
        System.out.format("Nome: %s | Matrícula: %s%n",
                getNome(),
                getMatricula());
                turma.exibir();
    }
}