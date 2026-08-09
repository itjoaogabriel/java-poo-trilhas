package com.joaotrilhas.trilha8.desafio1;

public class Vendedor extends Funcionario {

    private double comissao;
    public double getComissao() { return comissao; }

    public Vendedor(String nome, double salarioBase, double comissao) {
        super(nome, salarioBase);
        if (comissao < 0) {
            throw new IllegalArgumentException("Comissão não pode ser negativa.");
        }
        this.comissao = comissao;
    }
    @Override
    public double  getSalario() { return getSalarioBase() + comissao; }
    @Override
    public void exibir() {
        super.exibir();
        System.out.format("Comissão R$%.2f%n", getComissao());
    }
}
