package com.joaotrilhas.trilha5.desafio9;

public class Plano {

    private String nomePlano;
    private double preco;
    private int duracaoMeses;

    public String getNomePlano() { return nomePlano; }
    public double getPreco() { return preco; }
    public int getDuracaoMeses() { return duracaoMeses; }
    public double getPrecoAnual() { return preco * duracaoMeses; }

    public Plano(String nomePlano, double preco, int duracaoMeses) {
        if (nomePlano == null || nomePlano.isEmpty()) {
            throw new IllegalArgumentException("Preencha o campo nome.");
        }
        if (preco <= 0) {
            throw new IllegalArgumentException("O preço não pode ser nagativo.");
        }
        if (duracaoMeses < 1 || duracaoMeses > 12) {
            throw new IllegalArgumentException("O ano só possui 12 meses, informe uma duração válida.");
        }
        this.nomePlano = nomePlano;
        this.preco = preco;
        this.duracaoMeses = duracaoMeses;
    }

    public void exibirFichaPlano() {
        System.out.format("Plano: %s | Preço R$%.2f | Duração: %d meses | Valor anual R$%.2f%n%n",
                            getNomePlano(),
                            getPreco(),
                            getDuracaoMeses(),
                            getPrecoAnual());
    }
}