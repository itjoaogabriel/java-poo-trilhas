package com.joaotrilhas.trilha1.desafio3;
/*
Uma loja de eletrônicos precisa controlar seu estoque. Crie uma classe Produto com os atributos
nome, preco (double) e estoque (int). Implemente os métodos: void vender(int quantidade) que
subtrai do estoque e avisa se não há estoque suficiente, e void exibirEstoque() que mostra o nome
e a quantidade atual. Teste com pelo menos 2 produtos.
 */
public class Produto {

    String nome;
    double preco;
    int estoque;

    void vender(int quantidade) {
        if(estoque < quantidade){
            System.out.println("Estoque insuficiente.");
        } else {
            estoque = estoque - quantidade;
        }
    }

    void exibirEstoque(){
        System.out.format("Produto: %s | Quantidade estoque: %d.%n", nome, estoque);
    }
}
