package com.joaotrilhas.trilha4.desafio2;

public class Aluno {

    private String nome;
    private String matricula;
    private double nota1, nota2, nota3;

    public String getNome() { return nome; }
    public String getMatricula() { return matricula; }
    public double getNota1() { return nota1; }
    public double getNota2() { return nota2; }
    public double getNota3() { return nota3; }

    public void setNome(String nome) { this.nome = nome; }
    public void setMatricula(String matricula) { this.matricula = matricula; }

    public void setNota1(double nota1) {
        if (nota1 >= 0 && nota1 <= 10) {
            this.nota1 = nota1;
        } else {
            System.out.println("Erro. Informe uma nota válida.");
        }
    }
    public void setNota2(double nota2) {
        if (nota2 >= 0 && nota2 <= 10) {
            this.nota2 = nota2;
        } else {
            System.out.println("Erro. Informe uma nota válida.");
        }
    }
    public void setNota3(double nota3) {
        if (nota3 >= 0 && nota3 <= 10) {
            this.nota3 = nota3;
        } else {
            System.out.println("Erro. Informe uma nota válida.");
        }
    }
    public double getMedia() {
        return (nota1 + nota2 + nota3) / 3;
    }

    public String getSituacao() {
        if (getMedia() >= 6) {
            return "Aprovado";
        }
        else if (getMedia() >= 4) {
            return "Recuperação";
        } else {
            return "Reprovado";
        }
    }

    public void exibirBoletim() {
        System.out.format("Nome: %s | Matrícula: %s%n" +
                "Nota1: %.2f | Nota2: %.2f | Nota3: %.2f%n" +
                "Situação do aluno: %s%n%n", getNome(), getMatricula(),
                 getNota1(), getNota2(), getNota3(), getSituacao());
    }
}