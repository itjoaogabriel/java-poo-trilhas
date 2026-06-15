package com.joaotrilhas.trilha5.atividade1;

public class PessoaTeste {
    public static void main(String[] args) {

        Pessoa p1 = new Pessoa(); // construtor padrão
        Pessoa p2 = new Pessoa("Ana", 25); // construtor parametrizado
        Pessoa p3 = new Pessoa("Carlos", 30);

        p1.exibir();
        p2.exibir();
        p3.exibir();
    }
}
