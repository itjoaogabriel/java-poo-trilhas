package com.joaotrilhas.trilha6.atividade2;

public class Funcionario {

    private String nome;
    private String cargo;
    private double salario;

    public Funcionario(String nome, String cargo, double salario) {
        this.nome = nome;
        this.cargo = cargo;
        this.salario = salario;
    }

    public String getNome() { return nome; }
    public String getCargo() { return cargo; }
    public double getSalario() { return salario; }

    public void exibir() {
        System.out.format("Nome: %s | Cargo: %s | Salário R$%.2f%n",
                            getNome(),
                            getCargo(),
                            getSalario());
    }
}
