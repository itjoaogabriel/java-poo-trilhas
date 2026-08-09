package com.joaotrilhas.trilha8.desafio9;

public class Main {
    public static void main(String[] args) {

        Pessoa[] pessoas = new Pessoa[8];

        pessoas[0] = new Aluno("Ana", "01", "02", 10, 10, 10);
        pessoas[1] = new Aluno("Pedro", "02", "03", 3, 3, 3);
        pessoas[2] = new Aluno("Poliana", "03", "04", 5, 5, 5);
        pessoas[3] = new Professor("Maria", "04", "Ciências", 10000.0);
        pessoas[4] = new Professor("Jana", "05", "Português", 12000.0);
        pessoas[5] = new Professor("Anna", "06", "Inglês", 14000.0);
        pessoas[6] = new Coordenador("Jorge", "07", "Redação", 15000.0);
        pessoas[7] = new Coordenador("Joana", "08", "Química", 14000.0);

        for (Pessoa p : pessoas) {
            p.exibir();
        }

        for (Pessoa p : pessoas) {
            if(p instanceof Aluno a){
                System.out.printf("%n%s:%n%s%n", a.getNome(), a.getSituacao());
            }
        }
    }
}
