package com.joaotrilhas.trilha3.desafio6;

public class VendaTeste {

    public static void main(String[] args) {

        Venda venda1 = new Venda();
        Venda venda2 = new Venda();
        Venda venda3 = new Venda();

        venda1.setProduto("Celular");
        venda1.setValorBruto(3000.0);

        venda2.setProduto("Cama");
        venda2.setValorBruto(1100.0);

        venda3.setProduto("TV");
        venda3.setValorBruto(1000.0);

        venda1.aplicarDesconto(10);
        venda2.aplicarDesconto(35);
        venda3.aplicarDesconto(15);

        venda1.emitirNota();
        venda2.emitirNota();
        venda3.emitirNota();
    }
}
