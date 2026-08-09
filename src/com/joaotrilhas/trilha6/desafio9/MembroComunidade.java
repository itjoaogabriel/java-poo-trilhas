package com.joaotrilhas.trilha6.desafio9;

public class MembroComunidade extends Pessoa {

    private String dataIngresso;
    private boolean ativo;

    public String getDataIngresso() { return dataIngresso; }
    public boolean isAtivo() { return ativo; }

    public MembroComunidade(String nome, String cpf, String dataIngresso, boolean ativo) {
        super(nome, cpf);
        if (dataIngresso == null || dataIngresso.isEmpty()) {
            throw new IllegalArgumentException("Informe a data de ingresso.");
        }
        this.dataIngresso = dataIngresso;
        this.ativo = ativo;
    }
    @Override
    public void exibir() {
        super.exibir();
        System.out.format("Data de ingresso: %s | Situação: %s%n",
                            getDataIngresso(),
                            isAtivo() ? "Ativo" : "Indisponível");
    }
}
