package com.joaotrilhas.trilha7.desafio9;

public class Main {
    public static void main(String[] args) {

        Pagamento[] pagamentos = new Pagamento[4];

        pagamentos[0] = new PagamentoCartao(2000, 2);
        pagamentos[1] = new PagamentoCartao(1000, 12);
        pagamentos[2] = new PagamentoBoleto(4000, "20/07/2026");
        pagamentos[3] = new PagamentoPix(2000, "jojo@gmail.com");

        for (Pagamento a: pagamentos) {
            a.processar();
        }
        for (Pagamento a: pagamentos) {
            if (a instanceof PagamentoCartao p) {
                System.out.println("Número de parcelas: " + p.getNumeroParcelas());
            }
        }
    }
}
