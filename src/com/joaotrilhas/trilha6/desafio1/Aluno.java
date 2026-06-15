package com.joaotrilhas.trilha6.desafio1;

public class Aluno extends Pessoa {

    private String matricula;
    private String curso;

    public String getMatricula() { return matricula; }
    public String getCurso() { return curso; }

    public Aluno(String nome, String matricula, String curso, int idade) {
        super(nome, idade);
        if (matricula == null || matricula.isEmpty()) {
            throw new IllegalArgumentException("Informe uma matrícula.");
        }
        if (curso == null || curso.isEmpty()) {
            throw new IllegalArgumentException("Informe um curso.");
        }
        this.matricula = matricula;
        this.curso = curso;
    }

    @Override
    public void exibir() {
        super.exibir();
        System.out.format("Matrícula: %s | Curso: %s%n",
                            getMatricula(),
                            getCurso());
    }
}
