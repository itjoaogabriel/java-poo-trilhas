package com.joaotrilhas.trilha6.desafio4;

public class ProdutoPerecivel extends Produto{

    private String dataValidade;
    public String getDataValidade() { return dataValidade; }

    public ProdutoPerecivel(String nome, double preco, int estoque, String dataValidade) {
        super(nome, preco, estoque);
        if (dataValidade == null || dataValidade.isEmpty()) {
            throw new IllegalArgumentException("Informe uma data de validade.");
        }
        this.dataValidade = dataValidade;
    }
    @Override
    public void exibir() {
        super.exibir();
        System.out.format("Data de validade: %s%n", getDataValidade());
    }
}
