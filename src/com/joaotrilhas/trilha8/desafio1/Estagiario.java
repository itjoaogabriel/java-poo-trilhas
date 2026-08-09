package com.joaotrilhas.trilha8.desafio1;

public class Estagiario extends Funcionario {

    private int cargaHoraria;

    public int getCargaHoraria() { return cargaHoraria; }

    public Estagiario(String nome,double salarioBase, int cargaHoraria) {
        super(nome, salarioBase);
        if (cargaHoraria < 0) {
            throw new IllegalArgumentException("Carga horária não pode ser negativa.");
        }
        this.cargaHoraria = cargaHoraria;
    }
    @Override
    public void aplicarAumento(double percentual) {
        if (percentual <= 10 && percentual > 0) {
            super.aplicarAumento(percentual);
        } else {
            throw new IllegalArgumentException("Limite máximo de percentual de aumento para estagiário excedido.");
        }
    }
    @Override
    public double getSalario() { return getSalarioBase(); }

    @Override
    public void exibir() {
        super.exibir();
        System.out.format("Carga horária: %d horas%n", getCargaHoraria());
    }
}
