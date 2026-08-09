package com.joaotrilhas.trilha6.desafio9;

public class Aluno extends MembroComunidade {

    private String matricula;
    private String curso;

    public String getMatricula() { return matricula; }
    public String getCurso() { return curso; }

    public Aluno(String nome, String cpf, String dataIngresso, boolean ativo, String matricula, String curso) {
        super(nome, cpf, dataIngresso, ativo);
        if (matricula == null || matricula.isEmpty()) {
            throw new IllegalArgumentException("Informe a matrícula.");
        }
        if (curso == null || curso.isEmpty()) {
            throw new IllegalArgumentException("Informe um curso.");
        }
        this.matricula = matricula;
        this.curso = curso;
    }

    public void estudar() {
        if(isAtivo()) {
            System.out.format("%s está estudando.%n", getNome());
        } else {
            System.out.format("%s não está mais ativo na instituição.%n", getNome());
        }
    }
    @Override
    public void exibir() {
        super.exibir();
        System.out.format("Matrícula: %s | Curso: %s%n",
                            getMatricula(),
                            getCurso());
    }
}
