package com.joaotrilhas.trilha7.desafio1;

public class Funcionario {

        private String nome;
        private double salarioBase;

        public String getNome() { return nome; }
        public double getSalarioBase() { return salarioBase; }

        public Funcionario(String nome, double salarioBase) {
            if (nome == null || nome.isEmpty()) {
                throw new IllegalArgumentException("Informe um nome.");
            }
            if (salarioBase <= 0) {
                throw new IllegalArgumentException("Salário não pode ser negativo.");
            }
            this.nome = nome;
            this.salarioBase = salarioBase;
        }

        public void exibir() {
            System.out.format("Nome: %s | Salário R$%.2f%n",
                                getNome(),
                                getSalarioBase());
        }
}
