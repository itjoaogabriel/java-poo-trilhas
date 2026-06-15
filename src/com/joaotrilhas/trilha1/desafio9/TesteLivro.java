package com.joaotrilhas.trilha1.desafio9;

public class TesteLivro {

    public static void main(String[] args) {

        Livro livro1 = new Livro();
        Livro livro2 = new Livro();
        Livro livro3 = new Livro();

        livro1.titulo = "Amor líquido";
        livro1.autor = "Zygmunt Bauman";
        livro1.anoPublicacao = 1998;
        livro1.disponivel = true;

        livro2.titulo = "Modernidade líquida";
        livro2.autor = "Zygmunt Bauman";
        livro2.anoPublicacao = 2000;
        livro2.disponivel = true;

        livro3.titulo = "A gente mira no amor e acerta na solidão";
        livro3.autor = "Ana Suy";
        livro3.anoPublicacao = 2010;
        livro3.disponivel = true;

        livro1.emprestar();
        livro2.emprestar();
        livro2.emprestar();
        livro2.devolver();

        System.out.println();

        livro1.exibir();

        livro2.exibir();

        livro3.exibir();

    }
}
