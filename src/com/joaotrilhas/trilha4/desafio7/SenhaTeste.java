package com.joaotrilhas.trilha4.desafio7;

public class SenhaTeste {
    public static void main(String[] args) {

        Senha senha = new Senha();

        senha.setValor("KARma1234");
        senha.verificar("aaaaaaaaaa00000000000");
        senha.verificar("aaaaaaaaaa00000000000");
        senha.verificar("aaaaaaaaaa00000000000");
        senha.verificar("aaaaaaaaaa00000000000");
        System.out.format("Tentativas: %s%nSenha bloqueada? %s%n", senha.getTentativas(), senha.isBloqueada());
        senha.resetar();
        senha.setValor("KARma1234");
        senha.verificar("KARma1234");
        System.out.format("Tentativas: %s%nSenha bloqueada? %s%n", senha.getTentativas(), senha.isBloqueada());

    }
}
