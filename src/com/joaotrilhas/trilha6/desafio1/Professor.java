package com.joaotrilhas.trilha6.desafio1;

public class Professor extends Pessoa {

    private String disciplina;
    private double salario;

    public String getDisciplina() { return disciplina; }
    public double getSalario() { return salario; }

    public Professor(String nome, String disciplina, double salario, int idade) {
        super(nome, idade);
        if (disciplina == null || disciplina.isEmpty()) {
            throw new IllegalArgumentException("Informe uma disciplina.");
        }
        if (salario < 0) {
            throw new IllegalArgumentException("Salário não pode ser negativo.");
        }
        this.disciplina = disciplina;
        this.salario = salario;
    }

    @Override
    public void exibir() {
        super.exibir();
        System.out.format("Disciplina: %s | Salário R$%.2f%n",
                            getDisciplina(),
                            getSalario());
    }
}
