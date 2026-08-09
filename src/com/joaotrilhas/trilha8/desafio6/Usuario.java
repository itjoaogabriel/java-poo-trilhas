package com.joaotrilhas.trilha8.desafio6;

abstract class Usuario {

    private String nome;
    private String email;
    private boolean ativo;

    abstract String getTipo();
    public String getNome() { return nome; }
    public String getEmail() { return email; }
    public boolean isAtivo() { return ativo; }

    protected void setAtivo(boolean novoAtivo) { this.ativo = novoAtivo; }

    public Usuario(String nome, String email) {
        if (nome == null || nome.isEmpty()) {
            throw new IllegalArgumentException("Informe um nome.");
        }
        if (email == null || email.isEmpty()) {
            throw new IllegalArgumentException("Informe um email.");
        }
        this.nome = nome;
        this.email = email;
        this.ativo = true;
    }

    public void exibir() {
        System.out.printf("%nTipo: %s%n", getTipo());
        System.out.printf("Nome: %s | E-mail: %s | Status: %s%n",
                            getNome(),
                            getEmail(),
                            isAtivo() ? "Ativo" : "Inativo");
    }
}
