package com.joaotrilhas.trilha3.desafio9;

public class BibliotecaTeste {

    public static void main(String[] args) {

        Biblioteca livro1 = new Biblioteca();
        Biblioteca livro2 = new Biblioteca();
        Biblioteca livro3 = new Biblioteca();

        livro1.setTitulo("A gente mira no amor e acerta na solidão");
        livro1.setAnoPublicacao(2010);

        livro2.setTitulo("1984");
        livro2.setAnoPublicacao(1970);

        livro3.setTitulo("Sapiens");
        livro3.setAnoPublicacao(2000);

        livro1.emprestar();
        livro1.emprestar();
        System.out.println("Livro disponível?" + livro1.isDisponivel());
        livro1.devolver();
        System.out.println("Livro disponível?" + livro1.isDisponivel());
        livro2.emprestar();
        livro3.emprestar();
        livro3.devolver();

        livro1.exibir();
        livro2.exibir();
        livro3.exibir();
    }
}
