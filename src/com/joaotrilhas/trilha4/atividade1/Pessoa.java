package com.joaotrilhas.trilha4.atividade1;

public class Pessoa {

    private String nome;
    private int idade;
    private String email;

    // getters
    public String getNome() { return nome; }
    public int getIdade() { return idade; }
    public String getEmail() { return email; }

    // setters com validação
    public void setNome(String nome) {
        if (nome != null && !nome.isEmpty()) {
            this.nome = nome;
        } else {
            System.out.println("Nome inválido.");
        }
    }

    public void setIdade(int idade) {
        if (idade >= 0 && idade <= 120) {
            this.idade = idade;
        } else {
            System.out.println("Idade inválida.");
        }
    }

    public void setEmail(String email) {
        if (email != null && email.contains("@")) {
            this.email = email;
        } else {
            System.out.println("Email inválido.");
        }
    }

    public void exibir() {
        System.out.format("Nome: %s | Idade: %d | Email: %s%n",
                getNome(), getIdade(), getEmail());
    }
}
