package com.joaotrilhas.trilha2.exemplos;

public class metodosRETORNO {

    //calculadora
    double somar(double numeroA, double numeroB) {
        return numeroA + numeroB; //devolve o resultado para quem solicitou
    }

    double calcularDesconto(double preco, double percentual) {
        return preco - (preco * percentual / 100);
    }
}
