package com.joaotrilhas.trilha8.desafio5;

public class RelatorioVendas extends Relatorio implements Exportavel {

    private double totalVendas;
    private int quantidadeItens;

    public double getTotalVendas() { return totalVendas; }
    public int getQuantidadeItens() { return quantidadeItens; }

    @Override
    public String exportar(){
        return getTitulo() + "," + getData() + "," + getTotalVendas() + "," + getQuantidadeItens();
    }

    public RelatorioVendas(String titulo, String data, double totalVendas, int quantidadeItens) {
        super(titulo, data);
        if (totalVendas < 0) {
            throw new IllegalArgumentException("O total de vendas não pode ser negativo.");
        }
        if (quantidadeItens < 0) {
            throw new IllegalArgumentException("A quantidade de itens não pode ser negativa.");
        }
        this.totalVendas = totalVendas;
        this.quantidadeItens = quantidadeItens;
    }
    @Override
    public String gerarConteudo() {
        return "Total vendas: R$" + getTotalVendas() + " | Quantidade de " + getTitulo() + ": " + getQuantidadeItens();
    }
    @Override
    public int calcularTotalPaginas() {
        return quantidadeItens / 10 + 1;
    }
}
