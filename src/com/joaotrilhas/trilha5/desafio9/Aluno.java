package com.joaotrilhas.trilha5.desafio9;

public class Aluno {

    private String nomeAluno;
    private String cpf;
    private Plano plano;
    private boolean ativo;

    public String getNomeAluno() { return nomeAluno; }
    public String getCpf() { return cpf; }
    public Plano getPlano() { return plano; }
    public boolean isAtivo() { return ativo; }

    public Aluno(String nomeAluno, String cpf, Plano plano) {
        if (nomeAluno == null || nomeAluno.isEmpty()) {
            throw new IllegalArgumentException("Preencha o campo nome.");
        }
        if (cpf == null || cpf.isEmpty()) {
            throw new IllegalArgumentException("Preencha o campo CPF.");
        }
        this.nomeAluno = nomeAluno;
        this.cpf = cpf;
        ativo = true;
        this.plano = plano;
    }

    public void cancelarMatricula() {
        if (ativo) {
            ativo = false;
        } else {
            System.out.println("A matrícula já estava cancelada.");
        }
    }

    public double getValorPlano() {
        return plano.getPreco();
    }

    public void exibirFicha() {
        System.out.format("Nome aluno: %s | CPF: %s | Situação: %s%n",
                            getNomeAluno(),
                            getCpf(),
                            isAtivo() ? "Ativo" : "Inativo");
        plano.exibirFichaPlano();
    }
}
