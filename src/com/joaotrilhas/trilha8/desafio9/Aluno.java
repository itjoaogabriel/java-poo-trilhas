package com.joaotrilhas.trilha8.desafio9;

public class Aluno extends Pessoa implements Avaliavel {

    private String matricula;
    private double nota1;
    private double nota2;
    private double nota3;

    @Override
    public String getTipo() { return "Aluno"; }

    public String getMatricula() { return matricula; }
    public double getNota1() { return nota1; }
    public double getNota2() { return nota2; }
    public double getNota3() { return nota3; }

    public Aluno(String nome, String cpf, String matricula, double nota1, double nota2, double nota3) {
        super(nome, cpf);
        if (matricula == null || matricula.isEmpty()) {
            throw new IllegalArgumentException("Informe uma matrícula.");
        }
        if (nota1 < 0 || nota1 > 10) {
            throw new IllegalArgumentException("Informe nota1 entre 0 e 10.");
        }
        if (nota2 < 0 || nota2 > 10) {
            throw new IllegalArgumentException("Informe nota2 entre 0 e 10.");
        }
        if (nota3 < 0 || nota3 > 10) {
            throw new IllegalArgumentException("Informe nota3 entre 0 e 10.");
        }

        this.matricula = matricula;
        this.nota1 = nota1;
        this.nota2 = nota2;
        this.nota3 = nota3;
    }

    @Override
    public double calcularMedia() {
        return (nota1 + nota2 + nota3) / 3;
    }

    @Override
    public String getSituacao() {
        if (calcularMedia() >= 6) {
            return "Aprovado";
        }
        if (calcularMedia() >= 4) {
            return "Recuperação";
        } else {
            return "Reprovado";
        }
    }

    @Override
    public void exibir() {
        super.exibir();
        System.out.printf("Nota 1: %.2f | Nota 2: %.2f | Nota 3: %.2f%n" +
                        "Média: %.2f | Situação: %s%n",
                getNota1(),
                getNota2(),
                getNota3(),
                calcularMedia(),
                getSituacao());
    }
}
