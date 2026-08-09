package com.joaotrilhas.trilha6.desafio9;

public class Pessoa {

    private String nome;
    private String cpf;

    public String getNome() { return nome; }
    public String getCpf() { return cpf; }

    public Pessoa(String nome, String cpf) {
        if (nome == null || nome.isEmpty()) {
            throw new IllegalArgumentException("Informe um nome.");
        }
        if (cpf == null || cpf.isEmpty()) {
            throw new IllegalArgumentException("Informe um CPF.");
        }
        this.nome = nome;
        this.cpf = cpf;
    }

    public void exibir() {
        System.out.format("%nNome: %s | CPF: %s%n",
                            getNome(),
                            getCpf());
    }
}
