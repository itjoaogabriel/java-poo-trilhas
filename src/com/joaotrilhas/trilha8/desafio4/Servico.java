package com.joaotrilhas.trilha8.desafio4;

public class Servico implements Tributavel {

    private String descricao;
    private double valorHora;
    private int horas;

    public String getDescricao() { return descricao; }
    public double getValorHora() { return valorHora; }
    public int getHoras() { return horas; }

    public Servico(String descricao, double valorHora, int horas) {
        if (descricao == null || descricao.isEmpty()) {
            throw new IllegalArgumentException("Informe uma descrição.");
        }
        if (valorHora <= 0) {
            throw new IllegalArgumentException("O valor da hora não pode ser negativo.");
        }
        if (horas <= 0) {
            throw new IllegalArgumentException("Informe uma hora válida.");
        }

        this.descricao = descricao;
        this.valorHora = valorHora;
        this.horas = horas;
    }

    @Override
    public double calcularImposto() {
        return (valorHora * horas) * 0.15;
    }
}
