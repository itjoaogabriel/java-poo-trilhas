package com.joaotrilhas.trilha5.desafio7;

public class Turma {

    private String codigo;
    private String disciplina;
    private String professor;
    private String turno;

    public String getCodigo() { return codigo; }
    public String getDisciplina() { return disciplina; }
    public String getProfessor() { return professor; }
    public String getTurno() { return turno; }

    public Turma(String codigo, String disciplina, String professor, String turno) {
        if (codigo == null || codigo.isEmpty()) {
            throw new IllegalArgumentException("Preencha o campo codigo.");
        }
        if (disciplina == null || disciplina.isEmpty()) {
            throw new IllegalArgumentException("Preencha o campo disciplina.");
        }
        if (professor == null || professor.isEmpty()) {
            throw new IllegalArgumentException("Preencha o campo professor.");
        }
        if (turno == null || turno.isEmpty()) {
            throw new IllegalArgumentException("Preencha o campo turno.");
        }
        if (!turno.equals("manhã") && !turno.equals("tarde") && !turno.equals("noite")) {
            throw new IllegalArgumentException("Informe um turno válido.");
        }
        this.codigo = codigo;
        this.disciplina = disciplina;
        this.professor = professor;
        this.turno = turno;
    }

    public void exibir() {
        System.out.format("Professor: %s | Turno: %s | Disciplina: %s | Código: %s%n",
                            getProfessor(),
                            getTurno(),
                            getDisciplina(),
                            getCodigo());
    }
}