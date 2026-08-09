package com.joaotrilhas.trilha8.desafio6;

public class UsuarioAdmin extends Usuario implements Autenticavel {

    private String senhaHash;

    public String getSenhaHash() { return senhaHash; }
    public String getTipo() { return "Administrador."; }

    public UsuarioAdmin(String nome, String email, String senhaHash) {
        super(nome, email);
        if (senhaHash == null || senhaHash.isEmpty()) {
            throw new IllegalArgumentException("Informe uma senha.");
        }
        this.senhaHash = senhaHash;
    }
    @Override
    public boolean autenticar(String senha) {
        return senha.equals(senhaHash);
    }
    @Override
    public void bloquear() {
        setAtivo(false);
        System.out.println("Usuário bloqueado.");
    }
}
