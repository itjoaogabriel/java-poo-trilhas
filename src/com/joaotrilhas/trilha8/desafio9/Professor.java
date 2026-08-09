package com.joaotrilhas.trilha8.desafio9;

public class Professor extends Pessoa {

    private String disciplina;
    private double salario;

    @Override
    public String getTipo() { return "Professor"; }

    public String getDisciplina() { return disciplina; }
    public double getSalario() { return salario; }

    public Professor(String nome, String cpf, String disciplina, double salario) {
        super(nome, cpf);
        if (disciplina == null || disciplina.isEmpty()) {
            throw new IllegalArgumentException("Informe uma disciplina.");
        }
        if (salario <= 0) {
            throw new IllegalArgumentException("O salário não pode ser negativo.");
        }

        this.disciplina = disciplina;
        this.salario = salario;
    }

    @Override
    public void exibir() {
        super.exibir();
        System.out.printf("Disciplina: %s | Salário: R$%.2f%n",
                getDisciplina(),
                getSalario());
    }
}
