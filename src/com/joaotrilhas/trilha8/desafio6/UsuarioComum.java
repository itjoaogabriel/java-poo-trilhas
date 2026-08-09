package com.joaotrilhas.trilha8.desafio6;

public class UsuarioComum extends Usuario implements Autenticavel {

    private String senhaHash;
    private int tentativasLogin;

    public String getSenhaHash() { return senhaHash; }
    public int getTentativasLogin() { return tentativasLogin; }
    public String getTipo() { return "Comum."; }

    public UsuarioComum(String nome, String email, String senhaHash) {
        super(nome, email);
        if (senhaHash == null || senhaHash.isEmpty()) {
            throw new IllegalArgumentException("Informe uma senha.");
        }
        this.senhaHash = senhaHash;
        tentativasLogin = 0;
    }
    @Override
    public boolean autenticar(String senha) {

        if (!isAtivo()) {
            return false;
        } else if (senhaHash.equals(senha)) {
            return true;
        } else {
            tentativasLogin++;
            if (tentativasLogin >= 3) {
            System.out.printf("Limite de tentativas de login excedida. Bloqueado.%n");
            bloquear();
            }
        }
        return false;
    }
    @Override
    public void bloquear() {
        setAtivo(false);
        System.out.println("Usuário bloqueado.");
    }
}
