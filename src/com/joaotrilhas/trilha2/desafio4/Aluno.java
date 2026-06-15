package com.joaotrilhas.trilha2.desafio4;

public class Aluno {

    String nome;
    double nota1;
    double nota2;
    double nota3;

    double calcularMedia() {
        return (nota1 + nota2 + nota3) / 3;
    }

    void exibirBoletim() {
        double media = calcularMedia();
        if (media >= 6.0) {
            System.out.format("Aluno %s aprovado!%n", nome);
        } else if (media >= 4) {
            System.out.format("Aluno %s de recuperação.%n", nome);
        } else {
            System.out.format("Aluno %s reprovado!%n", nome);
        }
        System.out.format("Nota1: %.2f | Nota2: %.2f | Nota3: %.2f%n", nota1, nota2, nota3);
    }
}
