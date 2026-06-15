package com.joaotrilhas.trilha5.desafio9;

public class Academia {

    private String nomeAcademia;
    private double receita;

    public String getNomeAcademia() { return nomeAcademia; }
    public double getReceita() { return receita; }

    public Academia(String nomeAcademia) {
        if (nomeAcademia == null || nomeAcademia.isEmpty()) {
            throw new IllegalArgumentException("Preencha o campo com o nome da academia.");
        }
        this.nomeAcademia = nomeAcademia;
        receita = 0;
    }

    public void registrarPagamento(Aluno aluno) {
        if (aluno.isAtivo()) {
            receita += aluno.getValorPlano();
        } else {
            System.out.format("Aluno %s está inativo. Pagamento não registrado.%n", aluno.getNomeAluno());
        }
    }

    public void exibirRelatorio() {
        System.out.format("Nome da academia: %s | Receita R$%.2f%n",
                            getNomeAcademia(),
                            getReceita());
    }
}
