package com.joaotrilhas.trilha6.desafio3;

import com.joaotrilhas.trilha6.atividade2.Gerente;

public class Main {
    public static void main(String[] args) {

        Vendedor vendedor = new Vendedor("João", "Vendedor 1", 2000, 200);
        Gerente gerente = new Gerente("Paulo", 5000, "Industrial");
        Estagiario estagiario = new Estagiario("Ana", "Auxiliar", 1000, 6);

        vendedor.aplicarAumento(10);
        vendedor.exibir();
        gerente.exibir();
        //estagiario.aplicarAumento(0);
        //estagiario.aplicarAumento(20);
        estagiario.aplicarAumento(10);
        estagiario.exibir();
    }
}
