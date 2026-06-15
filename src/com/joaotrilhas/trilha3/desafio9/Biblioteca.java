package com.joaotrilhas.trilha3.desafio9;

public class Biblioteca {

    private String titulo;
    private int anoPublicacao;
    private boolean disponivel;

    public void setTitulo (String titulo) {
        this.titulo = titulo;
    }
    public void setAnoPublicacao (int anoPublicacao) {
        this.anoPublicacao = anoPublicacao;
    }

    public void emprestar() {
        if(disponivel) {
            disponivel = false;
            System.out.format("Empréstimo do livro %s realizado.%n", titulo);
        } else {
            System.out.format("Livro %s já está emprestado.%n", titulo);
        }
    }

    public void devolver() {
        if(!disponivel) {
            disponivel = true;
            System.out.format("Devolução do livro %s realizado.%n", titulo);
        } else {
            System.out.format("Livro %s já estava disponvível.%n", titulo);
        }
    }

    public boolean isDisponivel() {
        return disponivel;
    }

    public void exibir() {
        System.out.format("Título: %s | Ano de publicação: %d | Disponibilidade: %b%n", titulo, anoPublicacao, isDisponivel());
    }
}