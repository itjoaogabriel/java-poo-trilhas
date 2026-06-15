package com.joaotrilhas.trilha3.desafio6;

public class Venda {

    private String produto;
    private double valorBruto;
    private double desconto;

    public void setProduto (String produto) {
        this.produto = produto;
    }

    public void setValorBruto(double valorBruto) {
        this.valorBruto = valorBruto;
    }

    public void setValorDesconto(double desconto) {
        this.desconto = desconto;
    }

    public void aplicarDesconto(double percentual) {
        if (percentual > 0 && percentual <= 30) {
            desconto = valorBruto * (percentual / 100);
        } else {
            System.out.println("Precisa de aprovação para conseguir o desconto.\n");
        }
    }

    public double getValorLiquido() {
        return valorBruto - desconto;
    }

    public void emitirNota() {
        System.out.format("Produto: %s | Valor bruto R$%.2f | Desconto R$%.2f%n", produto, valorBruto, desconto);
        System.out.format("Valor líquido R$%.2f%n", getValorLiquido());
    }
}
