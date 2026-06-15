package com.joaotrilhas.trilha4.desafio9;

public class Funcionario {

    private String nome;
    private Cargo cargo;
    private boolean ativo;

    public String getNome() { return nome; }
    public Cargo getCargo() { return cargo; }
    public boolean isAtivo() {return ativo; }

    public void setNome(String nome) {
        if (nome != null && !nome.isEmpty()) {
            this.nome = nome;
        } else {
            System.out.println("Preencha o campo 'nome'.");
        }
    }

    public void setCargo(Cargo cargo) {
        if (cargo != null) {
            this.cargo = cargo;
        } else {
            System.out.println("Preencha o campo 'cargo'.");
        }
    }

    public double getSalario() {
        return cargo.getSalarioComBonus();
    }

    public void promover(int novoNivel) {
        if (novoNivel >= 1 && novoNivel <= 5) {
             cargo.setNivel(novoNivel);
        } else {
            System.out.println("Informe um nível válido.");
        }
    }

    public void desligar() {
        if (ativo) {
            ativo = false;
        }
    }
}