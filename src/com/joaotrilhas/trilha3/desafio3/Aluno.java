package com.joaotrilhas.trilha3.desafio3;

public class Aluno {

    private String nome;
    private double nota1;
    private double nota2;
    private double nota3;

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setNota1(double nota1) {
        if (nota1 >= 0 && nota1 <=10) {
            this.nota1 = nota1;
        } else {
            System.out.println("Nota inválida.");
        }
    }

    public void setNota2(double nota2) {
        if (nota2 >= 0 && nota2 <=10) {
            this.nota2 = nota2;
        } else {
            System.out.println("Nota inválida.");
        }
    }

    public void setNota3(double nota3) {
        if (nota3 >= 0 && nota3 <=10) {
            this.nota3 = nota3;
        } else {
            System.out.println("Nota inválida.");
        }
    }

    private double calcularMedia() {
        return (nota1 + nota2 + nota3) / 3;
    }

    public void exibirBoletim() {
        System.out.format("Nome: %s | Nota1: %.2f | Nota2: %.2f | Nota3: %.2f%n", nome, nota1, nota2, nota3);
        System.out.println("Média: " + calcularMedia());
    }
}