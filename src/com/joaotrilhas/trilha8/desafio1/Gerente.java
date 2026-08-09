package com.joaotrilhas.trilha8.desafio1;

public class Gerente extends Funcionario {

    private final double bonus;
    public double getBonus() { return bonus; }

    public Gerente(String nome, double salarioBase) {
        super(nome, salarioBase);
        bonus = getSalarioBase() * 0.2;
    }
    @Override
    public double getSalario() { return getSalarioBase() + bonus; }
    @Override
    public void exibir() {
        super.exibir();
        System.out.format("Bônus R$%.2f%n", getBonus());
    }
}
