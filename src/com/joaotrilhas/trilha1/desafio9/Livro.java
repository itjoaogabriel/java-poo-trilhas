package com.joaotrilhas.trilha1.desafio9;

public class Livro {

    String titulo;
    String autor;
    int anoPublicacao;
    boolean disponivel;

    void emprestar() {
        if(disponivel) {
            System.out.println("Empréstimo realizado.");
            disponivel = false;
        } else {
            System.out.println("Empréstimo negado, livro já está reservado.");
        }
    }

    void devolver() {
        if(!disponivel){
            disponivel = true;
            System.out.println("Livro disponível novamente.");
        } else {
            System.out.println("Livro já estava disponível.");
        }
    }

    void exibir() {
        System.out.format("Dados do livro %s: %n", titulo);
        System.out.format("Autor: %s | Ano publicação: %d | Disponibilidade: %b%n%n", autor, anoPublicacao, disponivel);
    }
}
