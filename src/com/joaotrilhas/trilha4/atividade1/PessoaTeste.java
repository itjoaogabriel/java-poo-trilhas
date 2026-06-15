package com.joaotrilhas.trilha4.atividade1;

public class PessoaTeste {
    public static void main(String[] args) {

        Pessoa pessoa = new Pessoa();

        pessoa.setNome("Ana");
        pessoa.setIdade(25);
        pessoa.setEmail("ana@email.com");
        pessoa.exibir();

        pessoa.setIdade(150);
        pessoa.setEmail("inválido");
        pessoa.exibir();
    }
}
