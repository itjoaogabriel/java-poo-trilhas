package com.joaotrilhas.trilha1.atividade2;
/*
Crie uma classe chamada Pessoa com os atributos nome (String) e idade (int). Adicione um método
void apresentar() que imprima uma mensagem com os dados da pessoa. No Main, instancie dois
objetos do tipo Pessoa com valores diferentes e chame o método apresentar() para cada um.
 */
public class Pessoa {

    String nome;
    int idade;

    void apresentar() {
        System.out.format("Nome: %s | Idade: %d%n", nome, idade);
    }
}
