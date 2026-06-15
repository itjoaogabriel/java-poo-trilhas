package com.joaotrilhas.trilha3.desafio5;

public class SenhaTeste {

    public static void main(String[] args) {

        Senha senha = new Senha();

        senha.definirSenha("abcd");
        senha.definirSenha("abcd12345678");
        senha.verificar("abcd");
        System.out.println(senha.verificar("abcd"));
        senha.verificar("abcd12345678");
        senha.exibirStatus();
    }
}
