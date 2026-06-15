package com.joaotrilhas.trilha6.desafio3;

public class Funcionario {

    private String nome;
    private String cargo;
    private double salario;

    public String getNome() { return nome; }
    public String getCargo() { return cargo; }
    public double getSalario() { return salario; }

    public Funcionario(String nome, String cargo, double salario) {
        if (nome == null || nome.isEmpty()) {
            throw new IllegalArgumentException("Informe um nome.");
        }
        if (cargo == null || cargo.isEmpty()) {
            throw new IllegalArgumentException("Informe um cargo.");
        }
        if (salario < 0) {
            throw new IllegalArgumentException("Salário não pode ser negativo.");
        }
        this.nome = nome;
        this.cargo = cargo;
        this.salario = salario;
    }

    public void aplicarAumento(double percentual){
        if (percentual > 50 || percentual < 0) {
            throw new IllegalArgumentException("Informe um percentual de aumento válido.");
        }
        salario += (salario * (percentual / 100));
    }

    public void exibir() {
        System.out.format("Nome: %s | Cargo: %s | Salário R$%.2f%n",
                            getNome(),
                            getCargo(),
                            getSalario());
    }
}