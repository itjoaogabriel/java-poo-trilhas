package com.joaotrilhas.trilha6.atividade2;

public class Gerente extends Funcionario{

    private String departamento;

    public Gerente(String nome, double salario, String departamento) {
        super(nome, "Gerente", salario);
        this.departamento = departamento;
    }

    public String getDepartamento() { return departamento; }

    @Override
    public void exibir() {
        super.exibir();
        System.out.format("Departamento: %s%n", getDepartamento());
    }
}
