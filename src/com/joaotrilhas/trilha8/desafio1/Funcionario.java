package com.joaotrilhas.trilha8.desafio1;

public abstract class Funcionario {

    private String nome;
    private double salarioBase;

    public String getNome() { return nome; }
    public double getSalarioBase() { return salarioBase; }
    public abstract double getSalario();

    protected void setSalarioBase(double novoSalario) { this.salarioBase = novoSalario; }

    public Funcionario(String nome, double salarioBase) {
        if (nome == null || nome.isEmpty()) {
            throw new IllegalArgumentException("Informe um nome.");
        }
        if (salarioBase <= 0) {
            throw new IllegalArgumentException("Salário não pode ser negativo.");
        }
        this.nome = nome;
        this.salarioBase = salarioBase;
    }

    public void aplicarAumento(double percentual) {
        if (percentual <= 0 || percentual > 50) {
            throw new IllegalArgumentException("Percentual inválido.");
        }
        setSalarioBase(getSalarioBase() + (getSalarioBase() * (percentual / 100)));
    }

    public void exibir() {
        System.out.format("Nome: %s | Salário R$%.2f%n",
                getNome(),
                getSalario());
    }
}
