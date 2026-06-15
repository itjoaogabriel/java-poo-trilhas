package com.joaotrilhas.trilha1.desafio7;

public class AlunoAcademia {

    String nome;
    double peso;
    double altura;

    double calcularIMC () {
        return peso / (altura * altura);
    }

    void classificar() {
        double imc = calcularIMC();

        if(imc < 18.5) {
             System.out.format("Nome: %s | Abaixo do peso.%n", nome);
        }
        else if(imc <= 24.9) {
            System.out.format("Nome: %s | Peso normal.%n", nome);
        } else {
            System.out.format("Nome: %s | Acima do peso.%n", nome);
        }
    }
}
