package com.joaotrilhas.trilha8.desafio9;

abstract class Pessoa {

    private String nome;
    private String cpf;

    abstract String getTipo();
    public String getNome() { return nome; }
    public String getCpf() { return cpf; }

    public Pessoa(String nome, String cpf) {
        if (nome == null || nome.isEmpty()) {
            throw new IllegalArgumentException("Informe um nome.");
        }
        if (cpf == null || cpf.isEmpty()) {
            throw new IllegalArgumentException("Informe um cpf.");
        }
        this.nome = nome;
        this.cpf = cpf;
    }

    public void exibir() {
        System.out.printf("%nTipo: %s%n" +
                        "Nome: %s | CPF: %s%n",
                        getTipo(),
                        getNome(),
                        getCpf());
    }
}
