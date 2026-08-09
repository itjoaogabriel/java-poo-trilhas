package com.joaotrilhas.trilha8.desafio9;

public class Coordenador extends Professor {

    private double bonus;

    @Override
    public String getTipo() { return "Coordenador"; }

    public double getBonus() { return bonus; }

    public Coordenador(String nome, String cpf, String disciplina, double salario) {
        super(nome, cpf,  disciplina, salario);

        this.bonus = salario * 0.15;
    }

    @Override
    public void exibir() {
        super.exibir();
        System.out.printf("Bônus: R$%.2f%n",
                getBonus());
    }
}
