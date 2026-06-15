package com.joaotrilhas.trilha3.desafio2;

public class Funcionario {

    private String nome;
    private  String cargo;
    private double salario;

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public void setSalario(double salario) {
        if (salario > 0.0) {
            this.salario = salario;
        } else {
            System.out.println("Valor informado inválido.");
        }
    }

    public void aplicarAumento(double percentual) {
        if (percentual >= 1 && percentual <= 50) {
            salario = salario + (salario * (percentual / 100));
        } else {
            System.out.println("Conta bloqueada temporariamente.");
        }
    }

    public void exibirAmento() {
        System.out.format("Nome: %s | Cargo: %s | Salário R$%.2f", nome, cargo, salario);
    }
}
