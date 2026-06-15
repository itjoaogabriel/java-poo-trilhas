package com.joaotrilhas.trilha2.desafio2;

public class CaixaTeste {

    public static void main(String[] args) {

        Caixa dia1 = new Caixa();
        dia1.saldo = 100;

        dia1.registrarVenda(10);
        dia1.registrarVenda(20);
        dia1.registrarVenda(15.5);
        dia1.registrarVenda(5.25);
        dia1.registrarDespesa(30);
        dia1.registrarDespesa(20);

        dia1.fecharCaixa();
    }
}
