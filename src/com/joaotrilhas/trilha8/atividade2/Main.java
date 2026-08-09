package com.joaotrilhas.trilha8.atividade2;

public class Main {
    public static void main(String[] args) {

        Tribunavel[] itens = new Tribunavel[2];

        itens[0] = new Produto("Notebook", 3500.0);
        itens[1] = new Produto("Consultoria", 2000.0);

        for (Tribunavel t:itens) {
            System.out.printf("Imposto: R$%.2f%n", t.calcularImposto());
        }
    }
}
