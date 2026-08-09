package com.joaotrilhas.trilha6.desafio9;

public class Main {
    public static void main(String[] args) {

        Aluno aluno1 = new Aluno("João", "09", "12/01/2026", false, "20", "ADS");
        Aluno aluno2 = new Aluno("Ana", "10", "13/01/2026", true, "21", "ADM");
        Professor professor1 = new Professor("Jana", "11", "12/01/2005", true, "Cálculo", "Mestre");
        Professor professor2 = new Professor("Carla", "12", "10/03/2015", true, "Algébra linear", "Doutora");
        Funcionario funcionario1 = new Funcionario("Jorge", "13", "10/10/2025", false, "Vigilância", 2000);
        Funcionario funcionario2 = new Funcionario("Paula", "14", "10/01/2015", true, "Cozinha", 2000);

        aluno1.estudar();
        aluno1.exibir();
        aluno2.estudar();
        aluno2.exibir();
        professor1.lecionar();
        professor1.exibir();
        professor2.lecionar();
        professor2.exibir();
        funcionario1.trabalhar();
        funcionario1.exibir();
        funcionario2.trabalhar();
        funcionario2.exibir();
    }
}
