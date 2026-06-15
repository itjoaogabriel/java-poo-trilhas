package com.joaotrilhas.trilha2.desafio5;

public class AlunoAcademia {

    String nome;
    String plano;
    int frequencia;

    void registrarPresenca() {
        frequencia++;
    }

    void exibirFrequencia() {

        System.out.format("Nome: %s | Plano: %s | Frequencia: %d dias%n", nome, plano, frequencia);
    }

    String avaliarEngajamento() {
        if(frequencia >= 20) {
            return "alto";
        } else if (frequencia >= 10) {
            return "médio";
        } else {
            return "baixo";
        }
    }

    void exibirEngajamento() {
        System.out.format("Engajamento %s: %s%n", nome, avaliarEngajamento());
    }
}