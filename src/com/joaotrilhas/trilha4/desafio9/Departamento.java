package com.joaotrilhas.trilha4.desafio9;

public class Departamento {

    private String nome;
    private double orcamento;

    public String getNome() { return nome; }
    public double getOrcamento() { return orcamento; }

    public void setNome(String nome) {
        if (nome != null && !nome.isEmpty()) {
            this.nome = nome;
        } else {
            System.out.println("Preencha o campo 'nome'.");
        }
    }

    public void setOrcamento(double orcamento) {
        if (orcamento > 0) {
            this.orcamento = orcamento;
        } else {
            System.out.println("Erro. O orcaçemento não pode ser negativo.");
        }
    }

    public void gastar(double valor) {
        if (orcamento >= valor) {
            orcamento -= valor;
        } else {
            System.out.println("Saldo insuficiente.");
        }
    }
}
