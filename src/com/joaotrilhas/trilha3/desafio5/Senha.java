package com.joaotrilhas.trilha3.desafio5;

public class Senha {

    private String valor;

    public void definirSenha(String senha) {
        if (senha.length() >= 8) {
            valor = senha;
        } else {
            System.out.println("Senha muito curta, escolha outra.");
        }
    }

    public boolean verificar(String tentativa) {
        return tentativa.equals(valor);
    }

    public void exibirStatus () {
        if (valor != null) {
            System.out.println("Senha definida.");
        } else {
            System.out.println("Defina uma senha.");
        }
    }
}
