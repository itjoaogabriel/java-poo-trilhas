package com.joaotrilhas.trilha8.atividade2;

public class Servico implements Tribunavel {

    private String descricao;
    private double valor;

    public String getDescricao() { return descricao; }
    public double getValor() { return valor; }

    public Servico(String descricao, double valor) {
        this.descricao = descricao;
        this.valor = valor;
    }
    @Override
    public double calcularImposto() { return valor * 0.15; }
}
