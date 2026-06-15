package com.joaotrilhas.trilha6.desafio3;

public class Vendedor extends Funcionario {

    private double comissao;
    @Override
    public double getSalario() { return super.getSalario() + comissao;}
    public double getComissao() { return comissao; }

    public Vendedor(String nome, String cargo, double salario, double comissao) {
        super(nome, cargo, salario);
        if (comissao < 0) {
            throw new IllegalArgumentException("Comissão não pode ser negativa.");
        }
        this.comissao = comissao;
    }

    @Override
    public void exibir() {
        super.exibir();
        System.out.format("Comissão R$%.2f%n", getComissao());
    }
}
