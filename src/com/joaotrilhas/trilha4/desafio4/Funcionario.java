package com.joaotrilhas.trilha4.desafio4;

public class Funcionario {

    private String nome;
    private String cargo;
    private double salario;
    private boolean ativo;

    public String getNome() { return nome; }
    public String getCargo() { return cargo; }
    public double getSalario() { return salario; }
    public boolean isAtivo() { return ativo; }

    public void setNome(String nome) {
        if (nome != null && !nome.isEmpty()) {
            this.nome = nome;
        } else {
            System.out.println("O espaço de nome não pode ficar vazio.");
        }
    }

    public void setCargo(String cargo) {
        if (cargo != null && !cargo.isEmpty()) {
            this.cargo = cargo;
        } else {
            System.out.println("O espaço de cargo não pode ficar vazio.");
        }
    }

    public void setSalario(double salario) {
        if (salario > 0) {
            this.salario = salario;
        } else {
            System.out.println("Erro. Informe um salario válido.");
        }
    }

    public void aplicarAumento(double percentual) {
        if (!ativo) {
            System.out.format("Aumento para %s bloqueado.%n", nome);
            return;
        }
        if (percentual > 0 && percentual <= 50) {
            salario = salario + (salario * (percentual / 100));
        } else {
            System.out.format("Percentual de aumento para %s excedeu o permitido pelo sistema.%n", getNome());
        }
    }

    public void demitir() {
        ativo = false;
        System.out.format("Colaborador %s demitido.%n", nome);
    }

    public void reativar() {
        ativo = true;
        System.out.format("Colaborador %s readmitido.%n", nome);
    }

    public double getSalarioLiquido() {
        return salario - (salario * (11.0 / 100)) - (salario * (15.0 / 100));
    }

    public void exibir() {
        System.out.format("%nNome: %s | Cargo: %s | Salário R$%.2f | Situação: %b%nSalário líquido R$%.2f%n",
                getNome(), getCargo(), getSalario(), isAtivo(), getSalarioLiquido());
    }
}