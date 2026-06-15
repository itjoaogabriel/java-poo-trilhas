package com.joaotrilhas.trilha5.desafio8;

public class Livro {

    private String titulo;
    private String autor;
    private int anoPublicacao;
    private boolean disponivel;

    public String getTitulo() { return titulo; }
    public String getAutor() { return autor; }
    public int getAnoPublicacao() { return anoPublicacao; }
    public boolean isDisponivel() { return disponivel; }

    public Livro(String titulo, String autor, int anoPublicacao) {
        if (titulo == null || titulo.isEmpty()) {
            throw new IllegalArgumentException("Preencha o campo título.");
        }
        if (autor == null || autor.isEmpty()) {
            throw new IllegalArgumentException("Preencha o campo autor.");
        }
        if (anoPublicacao < 1000 || anoPublicacao > 2025) {
            throw new IllegalArgumentException("Preencha o campo autor.");
        }
        this.titulo = titulo;
        this.autor = autor;
        this.anoPublicacao = anoPublicacao;
        disponivel = true;
    }

    public void emprestar() {
        if (disponivel) {
            disponivel = false;
            System.out.format("Empréstimo do livro %s realizado.%n", titulo);
        } else {
            System.out.format("Livro %s já está emprestado.%n", titulo);
        }
    }

    public void devolver() {
        if (!disponivel) {
            disponivel = true;
            System.out.format("Devolução do livro %s realizado.%n", titulo);
        } else {
            System.out.format("Livro %s já está disponível.%n", titulo);
        }
    }

    public void exibir() {
        System.out.format("Título: %s | Autor: %s | Ano publicação: %d | Situação: %s%n",
                            getTitulo(),
                            getAutor(),
                            getAnoPublicacao(),
                            isDisponivel() ? "Disponível" : "Emprestado");
    }
}
