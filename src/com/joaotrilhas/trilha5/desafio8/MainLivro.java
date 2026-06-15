package com.joaotrilhas.trilha5.desafio8;

public class MainLivro {
    public static void main(String[] args) {

        Livro livro1 = new Livro("Mar", "Ana", 2015);
        Livro livro2 = new Livro("Ar", "Ana Suy", 2016);
        Livro livro3 = new Livro("Fogo", "Anna", 2017);

        livro1.emprestar();
        livro2.emprestar();
        livro1.emprestar();
        livro1.devolver();
        livro1.emprestar();
        livro1.exibir();
        livro2.exibir();
        livro3.exibir();
    }
}
