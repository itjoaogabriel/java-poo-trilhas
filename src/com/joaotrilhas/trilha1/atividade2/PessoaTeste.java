package com.joaotrilhas.trilha1.atividade2;

public class PessoaTeste {

    public static void main(String[] args) {

        Pessoa pessoa1 = new Pessoa();

        pessoa1.nome = "Ana";
        pessoa1.idade = 18;

        Pessoa pessoa2 = new Pessoa();

        pessoa2.nome = "João";
        pessoa2.idade = 24;

        pessoa1.apresentar();
        pessoa2.apresentar();
    }
}
