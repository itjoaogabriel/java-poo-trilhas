package com.joaotrilhas.trilha6.desafio9;

public class Professor extends MembroComunidade {

    private String disciplina;
    private String titulacao;

    public String getDisciplina() { return disciplina; }
    public String getTitulacao() { return titulacao; }

    public Professor(String nome, String cpf, String dataIngresso, boolean ativo, String disciplina, String titulacao) {
        super(nome, cpf, dataIngresso, ativo);
        if (disciplina == null || disciplina.isEmpty()) {
            throw new IllegalArgumentException("Informe a disciplina.");
        }
        if (titulacao == null || titulacao.isEmpty()) {
            throw new IllegalArgumentException("Informe uma titulação.");
        }
        this.disciplina = disciplina;
        this.titulacao = titulacao;
    }

    public void lecionar() {
        if(isAtivo()) {
            System.out.format("%s está lecionando.%n", getNome());
        } else {
            System.out.format("%s não está mais ativo na instituição.%n", getNome());
        }
    }
    @Override
    public void exibir() {
        super.exibir();
        System.out.format("Disciplina: %s | Titulação: %s%n",
                getDisciplina(),
                getTitulacao());
    }
}
