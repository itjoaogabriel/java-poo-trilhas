package com.joaotrilhas.trilha3.atividade1;

public class PessoaTeste {

    public static void main(String[] args) {

        Pessoa pessoa1 = new Pessoa();

        pessoa1.setNome("Ana");
        pessoa1.setItade(18);

        Pessoa pessoa2 = new Pessoa();

        pessoa2.setNome("João");
        pessoa2.setItade(24);

        pessoa1.apresentar();
        pessoa1.setItade(-5);
        pessoa1.apresentar();
        pessoa2.apresentar();
    }
}
