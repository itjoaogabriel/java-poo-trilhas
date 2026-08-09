package com.joaotrilhas.trilha7.desafio1;

public class Gerente extends Funcionario {

    private double bonus;
    public double getBonus() { return bonus; }

    public Gerente(String nome, double salarioBase, double bonus) {
        super(nome, salarioBase);
        if (bonus < 0) {
            throw new IllegalArgumentException("Bônus não pode ser negativo.");
        }
        this.bonus = bonus;
    }
    @Override
    public double getSalarioBase() {
        return super.getSalarioBase() + bonus;
    }
    @Override
    public void exibir() {
        super.exibir();
        System.out.format("Bônus R$%.2f%n", getBonus());
    }
}
