package com.joaotrilhas.trilha8.desafio5;

public class Main {
    public static void main(String[] args) {

        Relatorio[] relatorios = new Relatorio[3];

        relatorios[0] = new RelatorioVendas("Crocs", "20/07/2025", 10000.0, 100);
        relatorios[1] = new RelatorioEstoque("Havaianas", "20/08/2025", 2000.0, 10);
        relatorios[2] = new RelatorioEstoque("Havaianas", "25/10/2025", 20000.0, 1000);

        for (Relatorio a : relatorios) {
            a.exibir();
        }
        for (Relatorio a : relatorios) {
            if (a instanceof RelatorioEstoque rE) {
                System.out.printf("%n%s",rE.exportar());
            }
            if (a instanceof RelatorioVendas rV) {
                System.out.printf("%n%s", rV.exportar());
            }
        }
    }
}
