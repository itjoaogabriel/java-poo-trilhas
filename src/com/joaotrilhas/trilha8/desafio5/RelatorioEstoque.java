package com.joaotrilhas.trilha8.desafio5;

public class RelatorioEstoque extends Relatorio implements Exportavel {

    private double valorTotal;
    private int totalProdutos;

    public double getValorTotal() { return valorTotal; }
    public int getTotalProdutos() { return totalProdutos; }

    @Override
    public String exportar(){
        return getTitulo() + "," + getData() + "," + getValorTotal() + "," + getTotalProdutos();
    }

    public RelatorioEstoque(String titulo, String data, double valorTotal, int totalProdutos) {
        super(titulo, data);
        if (valorTotal < 0) {
            throw new IllegalArgumentException("O valor total não pode ser negativo.");
        }
        if (totalProdutos < 0) {
            throw new IllegalArgumentException("O total de produtos não pode ser negativo..");
        }
        this.valorTotal = valorTotal;
        this.totalProdutos = totalProdutos;
    }
    @Override
    public String gerarConteudo() {
        return "Valor total R$" + getValorTotal() + " | Total " + getTitulo() + ": " + getTotalProdutos();
    }
    @Override
    public int calcularTotalPaginas() {
        return totalProdutos / 20 + 1;
    }
}
