package com.joaotrilhas.trilha8.desafio4;

public class Main {
    public static void main(String[] args) {

        double totalImpostos = 0;

        Tributavel[] tribunaveis = new Tributavel[3];

        tribunaveis[0] = new ProdutoDigital("Revista", 20);
        tribunaveis[1] = new ProdutoFisico("Carta", 10);
        tribunaveis[2] = new Servico("Professor", 20, 8);

        for (Tributavel a:tribunaveis){
            totalImpostos += a.calcularImposto();
        }

        System.out.printf("Total impostos: R$%.2f%n", totalImpostos);

        for (Tributavel a:tribunaveis){
            if (a instanceof ProdutoFisico pF){
                System.out.printf("Preço da %s: R$ %.2f%n",
                        pF.getNome(),
                        pF.getPreco());
            }
        }
    }
}
