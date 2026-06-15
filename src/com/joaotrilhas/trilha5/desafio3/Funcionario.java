package com.joaotrilhas.trilha5.desafio3;

public class Funcionario {

    private String nome;
    private String cargo;
    private double salario;
    private boolean ativo;

    public String getNome() { return nome; }
    public String getCargo() { return cargo; }
    public double getSalario() { return salario; }
    public boolean isAtivo() { return ativo; }

    public Funcionario(String nome, String cargo, double salario) {
        if (nome == null || nome.isEmpty()) {
            throw new IllegalArgumentException("O nome não pode ser vazio.");
        }
        if (salario <= 0) {
            throw new IllegalArgumentException("O salário não pode ser negativo.");
        }
        this.nome = nome;
        this.salario = salario;
        this.cargo = cargo;
        ativo = true;
    }

    public void aplicarAumento(double percentual) {
        if (percentual > 50) {
            throw new IllegalArgumentException("Aplique um percentual dentro do limite permitido de 50%.");
        } else {
            salario = salario + (salario * (percentual / 100));
        }
    }

    public void demitir() {
        if (ativo) {
            ativo = false;
        }
    }

    public void exibir() {
        System.out.format("Nome: %s | Cargo: %s | Salário: %.2f | Situação: %s%n%n",
                            getNome(),
                            getCargo(),
                            getSalario(),
                            isAtivo() ? "Ativo" : "Desligado");
    }
}
