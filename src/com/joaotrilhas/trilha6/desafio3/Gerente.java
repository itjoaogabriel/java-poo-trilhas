package com.joaotrilhas.trilha6.desafio3;

public class Gerente extends Funcionario {

    private String departamento;
    private double bonus;

    public String getDepartamento() { return departamento; }
    public double getBonus() { return bonus; }
    @Override
    public double getSalario() { return super.getSalario() + bonus; }

    public Gerente(String nome, String cargo, double salario, String departamento) {
        super(nome, "Gerente", salario);
        if (departamento == null || departamento.isEmpty()) {
            throw new IllegalArgumentException("Informe um departamento.");
        }
        this.departamento = departamento;
        this.bonus = super.getSalario() * 0.2;
    }

    @Override
    public void exibir() {
        super.exibir();
        System.out.format("Departamento: %s%n", getDepartamento());
    }
}
