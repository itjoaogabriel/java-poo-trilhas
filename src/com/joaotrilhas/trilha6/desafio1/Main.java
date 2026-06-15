package com.joaotrilhas.trilha6.desafio1;

public class Main {
    public static void main(String[] args) {

        Aluno aluno1 = new Aluno("João", "2020", "Matemática", 24);
        Aluno aluno2 = new Aluno("Ana", "2021", "Ciências", 21);
        Professor professor1 = new Professor("Clara", "Ciências", 3000, 30);
        Professor professor2 = new Professor("Carlos", "Matemática", 4000, 25);

        aluno1.exibir();
        aluno2.exibir();
        professor1.exibir();
        professor2.exibir();
    }
}