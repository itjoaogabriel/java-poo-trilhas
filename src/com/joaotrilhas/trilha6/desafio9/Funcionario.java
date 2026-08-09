package com.joaotrilhas.trilha6.desafio9;

public class Funcionario extends MembroComunidade {

    private String setor;
    private double salario;

    public String getSetor() { return setor; }
    public double getSalario() { return salario; }

    public Funcionario(String nome, String cpf, String dataIngresso, boolean ativo, String setor, double salario) {
        super(nome, cpf, dataIngresso, ativo);
        if (setor == null || setor.isEmpty()) {
            throw new IllegalArgumentException("Informe o setor.");
        }
        if (salario < 0) {
            throw new IllegalArgumentException("Salário não pode ser negativo.");
        }
        this.setor = setor;
        this.salario = salario;
    }

    public void trabalhar() {
        if(isAtivo()) {
            System.out.format("%s está trabalhando.%n", getNome());
        } else {
            System.out.format("%s não está mais ativo na instituição.%n", getNome());
        }
    }
    @Override
    public void exibir() {
        super.exibir();
        System.out.format("Setor: %s | Salário R$%.2f%n",
                getSetor(),
                getSalario());
    }
}
